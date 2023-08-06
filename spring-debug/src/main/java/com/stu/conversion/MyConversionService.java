package com.stu.conversion;

import org.springframework.core.convert.ConversionService;
import org.springframework.core.convert.TypeDescriptor;

/**
 * @ClassName: MyConversionService
 * @Author: JayChan
 * @Date: 2023/8/6 22:39
 * @Description: No description
 */

public class MyConversionService implements ConversionService {

	/**
	 * eg:return sourceType == Person.class && targetType == Son.class;
	 *
	 * @param sourceType the source type to convert from (may be {@code null} if source is {@code null})
	 * @param targetType the target type to convert to (required)
	 * @return
	 */
	@Override
	public boolean canConvert(Class<?> sourceType, Class<?> targetType) {
		return false;
	}

	/**
	 * eg:return sourceType.equals(targetType);
	 *
	 * @param sourceType context about the source type to convert from
	 * (may be {@code null} if source is {@code null})
	 * @param targetType context about the target type to convert to (required)
	 * @return
	 */
	@Override
	public boolean canConvert(TypeDescriptor sourceType, TypeDescriptor targetType) {
		return false;
	}

	/**
	 * eg:
	 * 		if (source instanceof Person && targetType == Son.class) {
	 * 			Person person = (Person) source;
	 * 			Son son = new Son();
	 * 			son.setName(person.getName());
	 * 			son.setAge(person.getAge());
	 * 			return targetType.cast(son);
	 *      }
	 * 		return null;
	 *
	 * @param source the source object to convert (may be {@code null})
	 * @param targetType the target type to convert to (required)
	 * @return
	 * @param <T>
	 */
	@Override
	public <T> T convert(Object source, Class<T> targetType) {
		return null;
	}

	@Override
	public Object convert(Object source, TypeDescriptor sourceType, TypeDescriptor targetType) {
		return null;
	}
}
