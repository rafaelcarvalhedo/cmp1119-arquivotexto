package br.com.pucgoias.mapper;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public interface BaseMapper<T> {

    Function<Map<String,String>,T> rowMapper();
}
