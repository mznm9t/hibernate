package core;

import java.io.Serializable;
import java.math.BigInteger;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.Date;

import org.hibernate.Hibernate;
import org.hibernate.HibernateException;
import org.hibernate.usertype.UserType;

public class DateLong implements UserType {


	private static final int[] TYPES = { Types.BIGINT};

	@SuppressWarnings("unchecked")
	public Class returnedClass() {
		return java.util.Date.class;
	}

	public boolean equals(Object x, Object y) {
		if(x ==null && y==null) return true;
		if(x ==null || y==null) return false;
		Date dx=(Date)x;
		Date dy=(Date)y;
		return dx.equals(dy);
	}

	public Object deepCopy(Object x) {
		if (x == null)
			return null;
		Date dx=(Date)x;
		return new Date(dx.getTime());
	}

	public boolean isMutable() {
		return true;
	}

	public int hashCode(Object arg) throws org.hibernate.HibernateException {
		return 0;
	}

	@Override
	public Object nullSafeGet(ResultSet rs, String[] names, Object owner)
			throws HibernateException, SQLException {
		BigInteger dateBigInteger=(java.math.BigInteger)Hibernate.BIG_INTEGER.nullSafeGet(rs, names[0]);
		
		return (dateBigInteger == null) ? null : new Date(dateBigInteger.longValue());

	}

	@Override
	public void nullSafeSet(PreparedStatement st, Object value, int index)
			throws HibernateException, SQLException {
		if(value!=null && value instanceof Date){
			Date date=(Date)value;
			Long dateLong=new Long(date.getTime());
			BigInteger bigInt=new BigInteger(dateLong.toString());
			Hibernate.BIG_INTEGER.nullSafeSet(st, bigInt, index);			
		}else Hibernate.BIG_INTEGER.nullSafeSet(st, null, index);
		
	}

	@Override
	public Object replace(Object original, Object target, Object owner)
			throws HibernateException {
		 return deepCopy(original);
	}
	
	@Override
	public Serializable disassemble(Object value) throws HibernateException {
		 return (Serializable) deepCopy(value);
	}

	@Override
	public Object assemble(Serializable cached, Object owner)
			throws HibernateException {
		 return deepCopy(cached);
	}
	
	@Override
	public int[] sqlTypes() {
		return TYPES;
	}

	

	

}
