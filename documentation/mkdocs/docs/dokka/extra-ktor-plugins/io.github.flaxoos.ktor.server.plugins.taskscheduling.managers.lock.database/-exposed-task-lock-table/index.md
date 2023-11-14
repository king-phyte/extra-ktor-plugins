---
title: ExposedTaskLockTable
---
//[extra-ktor-plugins](../../../index.md)/[io.github.flaxoos.ktor.server.plugins.taskscheduling.managers.lock.database](../index.md)/[ExposedTaskLockTable](index.md)



# ExposedTaskLockTable



[jvm]\
abstract class [ExposedTaskLockTable](index.md)(tableName: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.md)) : Table



## Constructors


| | |
|---|---|
| [ExposedTaskLockTable](-exposed-task-lock-table.md) | [jvm]<br>constructor(tableName: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.md)) |


## Properties


| Name | Summary |
|---|---|
| [autoIncColumn](index.md#-119017270%2FProperties%2F1975120172) | [jvm]<br>val [autoIncColumn](index.md#-119017270%2FProperties%2F1975120172): Column&lt;*&gt;? |
| [columns](index.md#-527477422%2FProperties%2F1975120172) | [jvm]<br>open override val [columns](index.md#-527477422%2FProperties%2F1975120172): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.md)&lt;Column&lt;*&gt;&gt; |
| [concurrencyIndex](concurrency-index.md) | [jvm]<br>abstract val [concurrencyIndex](concurrency-index.md): Column&lt;[Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.md)&gt; |
| [ddl](index.md#-98631389%2FProperties%2F1975120172) | [jvm]<br>val [ddl](index.md#-98631389%2FProperties%2F1975120172): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.md)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.md)&gt; |
| [fields](index.md#1767535600%2FProperties%2F1975120172) | [jvm]<br>open override val [fields](index.md#1767535600%2FProperties%2F1975120172): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.md)&lt;Expression&lt;*&gt;&gt; |
| [foreignKeys](index.md#-1277801049%2FProperties%2F1975120172) | [jvm]<br>val [foreignKeys](index.md#-1277801049%2FProperties%2F1975120172): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.md)&lt;ForeignKeyConstraint&gt; |
| [indices](index.md#-1684006712%2FProperties%2F1975120172) | [jvm]<br>val [indices](index.md#-1684006712%2FProperties%2F1975120172): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.md)&lt;Index&gt; |
| [lockedAt](locked-at.md) | [jvm]<br>abstract val [lockedAt](locked-at.md): Column&lt;Instant&gt; |
| [name](name.md) | [jvm]<br>abstract val [name](name.md): Column&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.md)&gt; |
| [primaryKey](index.md#-479487666%2FProperties%2F1975120172) | [jvm]<br>open val [primaryKey](index.md#-479487666%2FProperties%2F1975120172): Table.PrimaryKey? |
| [realFields](index.md#-1960918000%2FProperties%2F1975120172) | [jvm]<br>open val [realFields](index.md#-1960918000%2FProperties%2F1975120172): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.md)&lt;Expression&lt;*&gt;&gt; |
| [schemaName](index.md#441115999%2FProperties%2F1975120172) | [jvm]<br>val [schemaName](index.md#441115999%2FProperties%2F1975120172): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.md)? |
| [source](index.md#1676246222%2FProperties%2F1975120172) | [jvm]<br>open override val [source](index.md#1676246222%2FProperties%2F1975120172): ColumnSet |
| [tableName](index.md#886371510%2FProperties%2F1975120172) | [jvm]<br>open val [tableName](index.md#886371510%2FProperties%2F1975120172): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.md) |


## Functions


| Name | Summary |
|---|---|
| [autoGenerate](index.md#1908081876%2FExtensions%2F1975120172) | [jvm]<br>fun Column&lt;[UUID](https://docs.oracle.com/javase/8/docs/api/java/util/UUID.md)&gt;.[autoGenerate](index.md#1908081876%2FExtensions%2F1975120172)(): Column&lt;[UUID](https://docs.oracle.com/javase/8/docs/api/java/util/UUID.md)&gt; |
| [autoinc](index.md#1325297933%2FExtensions%2F1975120172) | [jvm]<br>fun &lt;[N](index.md#1325297933%2FExtensions%2F1975120172) : [Comparable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-comparable/index.md)&lt;[N](index.md#1325297933%2FExtensions%2F1975120172)&gt;&gt; Column&lt;EntityID&lt;[N](index.md#1325297933%2FExtensions%2F1975120172)&gt;&gt;.[autoinc](index.md#1325297933%2FExtensions%2F1975120172)(idSeqName: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.md)?): Column&lt;EntityID&lt;[N](index.md#1325297933%2FExtensions%2F1975120172)&gt;&gt; |
| [autoIncrement](index.md#1732389443%2FExtensions%2F1975120172) | [jvm]<br>fun &lt;[N](index.md#1732389443%2FExtensions%2F1975120172) : [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.md)&gt; Column&lt;[N](index.md#1732389443%2FExtensions%2F1975120172)&gt;.[autoIncrement](index.md#1732389443%2FExtensions%2F1975120172)(idSeqName: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.md)?): Column&lt;[N](index.md#1732389443%2FExtensions%2F1975120172)&gt; |
| [binary](index.md#1058154362%2FFunctions%2F1975120172) | [jvm]<br>fun [binary](index.md#1058154362%2FFunctions%2F1975120172)(name: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.md)): Column&lt;[ByteArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.md)&gt;<br>fun [binary](index.md#547677603%2FFunctions%2F1975120172)(name: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.md), length: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.md)): Column&lt;[ByteArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.md)&gt; |
| [blob](index.md#62882454%2FFunctions%2F1975120172) | [jvm]<br>fun [blob](index.md#62882454%2FFunctions%2F1975120172)(name: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.md)): Column&lt;ExposedBlob&gt; |
| [bool](index.md#-2086032349%2FFunctions%2F1975120172) | [jvm]<br>fun [bool](index.md#-2086032349%2FFunctions%2F1975120172)(name: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.md)): Column&lt;[Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.md)&gt; |
| [byte](index.md#913984449%2FFunctions%2F1975120172) | [jvm]<br>fun [byte](index.md#913984449%2FFunctions%2F1975120172)(name: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.md)): Column&lt;[Byte](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte/index.md)&gt; |
| [char](index.md#-1525656689%2FFunctions%2F1975120172) | [jvm]<br>fun [char](index.md#-1525656689%2FFunctions%2F1975120172)(name: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.md)): Column&lt;[Char](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char/index.md)&gt;<br>fun [char](index.md#1285168752%2FFunctions%2F1975120172)(name: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.md), length: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.md), collate: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.md)?): Column&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.md)&gt; |
| [check](index.md#1203492787%2FFunctions%2F1975120172) | [jvm]<br>fun [check](index.md#1203492787%2FFunctions%2F1975120172)(name: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.md), op: SqlExpressionBuilder.() -&gt; Op&lt;[Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.md)&gt;) |
| [check](index.md#-467711850%2FExtensions%2F1975120172) | [jvm]<br>fun &lt;[T](index.md#-467711850%2FExtensions%2F1975120172)&gt; Column&lt;[T](index.md#-467711850%2FExtensions%2F1975120172)&gt;.[check](index.md#-467711850%2FExtensions%2F1975120172)(name: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.md), op: SqlExpressionBuilder.(Column&lt;[T](index.md#-467711850%2FExtensions%2F1975120172)&gt;) -&gt; Op&lt;[Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.md)&gt;): Column&lt;[T](index.md#-467711850%2FExtensions%2F1975120172)&gt; |
| [clientDefault](index.md#1445495208%2FExtensions%2F1975120172) | [jvm]<br>fun &lt;[T](index.md#1445495208%2FExtensions%2F1975120172)&gt; Column&lt;[T](index.md#1445495208%2FExtensions%2F1975120172)&gt;.[clientDefault](index.md#1445495208%2FExtensions%2F1975120172)(defaultValue: () -&gt; [T](index.md#1445495208%2FExtensions%2F1975120172)): Column&lt;[T](index.md#1445495208%2FExtensions%2F1975120172)&gt; |
| [createStatement](index.md#1499019292%2FFunctions%2F1975120172) | [jvm]<br>open override fun [createStatement](index.md#1499019292%2FFunctions%2F1975120172)(): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.md)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.md)&gt; |
| [crossJoin](index.md#-134578527%2FFunctions%2F1975120172) | [jvm]<br>open infix override fun [crossJoin](index.md#-134578527%2FFunctions%2F1975120172)(otherTable: ColumnSet): Join |
| [customEnumeration](index.md#67934265%2FFunctions%2F1975120172) | [jvm]<br>fun &lt;[T](index.md#67934265%2FFunctions%2F1975120172) : [Enum](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-enum/index.md)&lt;[T](index.md#67934265%2FFunctions%2F1975120172)&gt;&gt; [customEnumeration](index.md#67934265%2FFunctions%2F1975120172)(name: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.md), sql: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.md)?, fromDb: ([Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.md)) -&gt; [T](index.md#67934265%2FFunctions%2F1975120172), toDb: ([T](index.md#67934265%2FFunctions%2F1975120172)) -&gt; [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.md)): Column&lt;[T](index.md#67934265%2FFunctions%2F1975120172)&gt; |
| [databaseGenerated](index.md#-1946041873%2FExtensions%2F1975120172) | [jvm]<br>fun &lt;[T](index.md#-1946041873%2FExtensions%2F1975120172)&gt; Column&lt;[T](index.md#-1946041873%2FExtensions%2F1975120172)&gt;.[databaseGenerated](index.md#-1946041873%2FExtensions%2F1975120172)(): Column&lt;[T](index.md#-1946041873%2FExtensions%2F1975120172)&gt; |
| [decimal](index.md#650705094%2FFunctions%2F1975120172) | [jvm]<br>fun [decimal](index.md#650705094%2FFunctions%2F1975120172)(name: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.md), precision: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.md), scale: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.md)): Column&lt;[BigDecimal](https://docs.oracle.com/javase/8/docs/api/java/math/BigDecimal.md)&gt; |
| [default](index.md#-1554466462%2FExtensions%2F1975120172) | [jvm]<br>fun &lt;[T](index.md#-1554466462%2FExtensions%2F1975120172)&gt; Column&lt;[T](index.md#-1554466462%2FExtensions%2F1975120172)&gt;.[default](index.md#-1554466462%2FExtensions%2F1975120172)(defaultValue: [T](index.md#-1554466462%2FExtensions%2F1975120172)): Column&lt;[T](index.md#-1554466462%2FExtensions%2F1975120172)&gt;<br>fun &lt;[T](index.md#-1018229975%2FExtensions%2F1975120172)&gt; CompositeColumn&lt;[T](index.md#-1018229975%2FExtensions%2F1975120172)&gt;.[default](index.md#-1018229975%2FExtensions%2F1975120172)(defaultValue: [T](index.md#-1018229975%2FExtensions%2F1975120172)): CompositeColumn&lt;[T](index.md#-1018229975%2FExtensions%2F1975120172)&gt; |
| [defaultExpression](index.md#-1090095358%2FExtensions%2F1975120172) | [jvm]<br>fun &lt;[T](index.md#-1090095358%2FExtensions%2F1975120172)&gt; Column&lt;[T](index.md#-1090095358%2FExtensions%2F1975120172)&gt;.[defaultExpression](index.md#-1090095358%2FExtensions%2F1975120172)(defaultValue: Expression&lt;[T](index.md#-1090095358%2FExtensions%2F1975120172)&gt;): Column&lt;[T](index.md#-1090095358%2FExtensions%2F1975120172)&gt; |
| [describe](index.md#304080744%2FFunctions%2F1975120172) | [jvm]<br>open override fun [describe](index.md#304080744%2FFunctions%2F1975120172)(s: Transaction, queryBuilder: QueryBuilder) |
| [double](index.md#638663498%2FFunctions%2F1975120172) | [jvm]<br>fun [double](index.md#638663498%2FFunctions%2F1975120172)(name: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.md)): Column&lt;[Double](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.md)&gt; |
| [dropStatement](index.md#-1545038385%2FFunctions%2F1975120172) | [jvm]<br>open override fun [dropStatement](index.md#-1545038385%2FFunctions%2F1975120172)(): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.md)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.md)&gt; |
| [entityId](index.md#-1176101151%2FFunctions%2F1975120172) | [jvm]<br>fun &lt;[ID](index.md#-1176101151%2FFunctions%2F1975120172) : [Comparable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-comparable/index.md)&lt;[ID](index.md#-1176101151%2FFunctions%2F1975120172)&gt;&gt; [entityId](index.md#-1176101151%2FFunctions%2F1975120172)(name: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.md), table: IdTable&lt;[ID](index.md#-1176101151%2FFunctions%2F1975120172)&gt;): Column&lt;EntityID&lt;[ID](index.md#-1176101151%2FFunctions%2F1975120172)&gt;&gt;<br>fun &lt;[ID](index.md#1579776871%2FFunctions%2F1975120172) : [Comparable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-comparable/index.md)&lt;[ID](index.md#1579776871%2FFunctions%2F1975120172)&gt;&gt; [entityId](index.md#1579776871%2FFunctions%2F1975120172)(name: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.md), originalColumn: Column&lt;[ID](index.md#1579776871%2FFunctions%2F1975120172)&gt;): Column&lt;EntityID&lt;[ID](index.md#1579776871%2FFunctions%2F1975120172)&gt;&gt; |
| [entityId](index.md#1298102606%2FExtensions%2F1975120172) | [jvm]<br>fun &lt;[T](index.md#1298102606%2FExtensions%2F1975120172) : [Comparable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-comparable/index.md)&lt;[T](index.md#1298102606%2FExtensions%2F1975120172)&gt;&gt; Column&lt;[T](index.md#1298102606%2FExtensions%2F1975120172)&gt;.[entityId](index.md#1298102606%2FExtensions%2F1975120172)(): Column&lt;EntityID&lt;[T](index.md#1298102606%2FExtensions%2F1975120172)&gt;&gt; |
| [enumeration](index.md#-1375150884%2FFunctions%2F1975120172) | [jvm]<br>inline fun &lt;[T](index.md#-1375150884%2FFunctions%2F1975120172) : [Enum](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-enum/index.md)&lt;[T](index.md#-1375150884%2FFunctions%2F1975120172)&gt;&gt; [enumeration](index.md#-1375150884%2FFunctions%2F1975120172)(name: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.md)): Column&lt;[T](index.md#-1375150884%2FFunctions%2F1975120172)&gt;<br>fun &lt;[T](index.md#310280626%2FFunctions%2F1975120172) : [Enum](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-enum/index.md)&lt;[T](index.md#310280626%2FFunctions%2F1975120172)&gt;&gt; [enumeration](index.md#310280626%2FFunctions%2F1975120172)(name: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.md), klass: [KClass](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.reflect/-k-class/index.md)&lt;[T](index.md#310280626%2FFunctions%2F1975120172)&gt;): Column&lt;[T](index.md#310280626%2FFunctions%2F1975120172)&gt; |
| [enumerationByName](index.md#-2069184673%2FFunctions%2F1975120172) | [jvm]<br>inline fun &lt;[T](index.md#-2069184673%2FFunctions%2F1975120172) : [Enum](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-enum/index.md)&lt;[T](index.md#-2069184673%2FFunctions%2F1975120172)&gt;&gt; [enumerationByName](index.md#-2069184673%2FFunctions%2F1975120172)(name: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.md), length: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.md)): Column&lt;[T](index.md#-2069184673%2FFunctions%2F1975120172)&gt;<br>fun &lt;[T](index.md#967420533%2FFunctions%2F1975120172) : [Enum](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-enum/index.md)&lt;[T](index.md#967420533%2FFunctions%2F1975120172)&gt;&gt; [enumerationByName](index.md#967420533%2FFunctions%2F1975120172)(name: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.md), length: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.md), klass: [KClass](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.reflect/-k-class/index.md)&lt;[T](index.md#967420533%2FFunctions%2F1975120172)&gt;): Column&lt;[T](index.md#967420533%2FFunctions%2F1975120172)&gt; |
| [equals](index.md#-1257999178%2FFunctions%2F1975120172) | [jvm]<br>open operator override fun [equals](index.md#-1257999178%2FFunctions%2F1975120172)(other: [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.md)?): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.md) |
| [float](index.md#-1280710735%2FFunctions%2F1975120172) | [jvm]<br>fun [float](index.md#-1280710735%2FFunctions%2F1975120172)(name: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.md)): Column&lt;[Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.md)&gt; |
| [foreignKey](index.md#753676639%2FFunctions%2F1975120172) | [jvm]<br>fun [foreignKey](index.md#753676639%2FFunctions%2F1975120172)(vararg references: [Pair](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-pair/index.md)&lt;Column&lt;*&gt;, Column&lt;*&gt;&gt;, onUpdate: ReferenceOption?, onDelete: ReferenceOption?, name: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.md)?)<br>fun [foreignKey](index.md#-1550008214%2FFunctions%2F1975120172)(vararg from: Column&lt;*&gt;, target: Table.PrimaryKey, onUpdate: ReferenceOption?, onDelete: ReferenceOption?, name: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.md)?) |
| [fullJoin](index.md#-1482579372%2FFunctions%2F1975120172) | [jvm]<br>open infix override fun [fullJoin](index.md#-1482579372%2FFunctions%2F1975120172)(otherTable: ColumnSet): Join |
| [hashCode](index.md#-822775952%2FFunctions%2F1975120172) | [jvm]<br>open override fun [hashCode](index.md#-822775952%2FFunctions%2F1975120172)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.md) |
| [index](index.md#977532225%2FFunctions%2F1975120172) | [jvm]<br>fun [index](index.md#977532225%2FFunctions%2F1975120172)(isUnique: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.md), vararg columns: Column&lt;*&gt;)<br>fun [index](index.md#-89973378%2FFunctions%2F1975120172)(customIndexName: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.md)?, isUnique: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.md), vararg columns: Column&lt;*&gt;, functions: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.md)&lt;ExpressionWithColumnType&lt;*&gt;&gt;?, indexType: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.md)?, filterCondition: FilterCondition) |
| [index](index.md#-1206961544%2FExtensions%2F1975120172) | [jvm]<br>fun &lt;[T](index.md#-1206961544%2FExtensions%2F1975120172)&gt; Column&lt;[T](index.md#-1206961544%2FExtensions%2F1975120172)&gt;.[index](index.md#-1206961544%2FExtensions%2F1975120172)(customIndexName: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.md)?, isUnique: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.md)): Column&lt;[T](index.md#-1206961544%2FExtensions%2F1975120172)&gt; |
| [innerJoin](index.md#907117751%2FFunctions%2F1975120172) | [jvm]<br>open infix override fun [innerJoin](index.md#907117751%2FFunctions%2F1975120172)(otherTable: ColumnSet): Join |
| [integer](index.md#-1079359085%2FFunctions%2F1975120172) | [jvm]<br>fun [integer](index.md#-1079359085%2FFunctions%2F1975120172)(name: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.md)): Column&lt;[Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.md)&gt; |
| [join](index.md#-759475769%2FFunctions%2F1975120172) | [jvm]<br>open override fun [join](index.md#-759475769%2FFunctions%2F1975120172)(otherTable: ColumnSet, joinType: JoinType, onColumn: Expression&lt;*&gt;?, otherColumn: Expression&lt;*&gt;?, additionalConstraint: SqlExpressionBuilder.() -&gt; Op&lt;[Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.md)&gt;?): Join |
| [largeText](index.md#-831337277%2FFunctions%2F1975120172) | [jvm]<br>fun [largeText](index.md#-831337277%2FFunctions%2F1975120172)(name: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.md), collate: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.md)?, eagerLoading: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.md)): Column&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.md)&gt; |
| [leftJoin](index.md#-2030280756%2FFunctions%2F1975120172) | [jvm]<br>open infix override fun [leftJoin](index.md#-2030280756%2FFunctions%2F1975120172)(otherTable: ColumnSet): Join |
| [long](index.md#-1988429259%2FFunctions%2F1975120172) | [jvm]<br>fun [long](index.md#-1988429259%2FFunctions%2F1975120172)(name: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.md)): Column&lt;[Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.md)&gt; |
| [mediumText](index.md#-326748191%2FFunctions%2F1975120172) | [jvm]<br>fun [mediumText](index.md#-326748191%2FFunctions%2F1975120172)(name: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.md), collate: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.md)?, eagerLoading: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.md)): Column&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.md)&gt; |
| [modifyStatement](index.md#1323802714%2FFunctions%2F1975120172) | [jvm]<br>open override fun [modifyStatement](index.md#1323802714%2FFunctions%2F1975120172)(): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.md)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.md)&gt; |
| [nameInDatabaseCase](index.md#496714128%2FFunctions%2F1975120172) | [jvm]<br>fun [nameInDatabaseCase](index.md#496714128%2FFunctions%2F1975120172)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.md) |
| [nameInDatabaseCaseUnquoted](index.md#207155279%2FFunctions%2F1975120172) | [jvm]<br>fun [nameInDatabaseCaseUnquoted](index.md#207155279%2FFunctions%2F1975120172)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.md) |
| [nullable](index.md#1935788434%2FExtensions%2F1975120172) | [jvm]<br>fun &lt;[T](index.md#1935788434%2FExtensions%2F1975120172) : [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.md), [C](index.md#1935788434%2FExtensions%2F1975120172) : CompositeColumn&lt;[T](index.md#1935788434%2FExtensions%2F1975120172)&gt;&gt; [C](index.md#1935788434%2FExtensions%2F1975120172).[nullable](index.md#1935788434%2FExtensions%2F1975120172)(): CompositeColumn&lt;[T](index.md#1935788434%2FExtensions%2F1975120172)?&gt;<br>fun &lt;[T](index.md#1445138239%2FExtensions%2F1975120172) : [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.md)&gt; Column&lt;[T](index.md#1445138239%2FExtensions%2F1975120172)&gt;.[nullable](index.md#1445138239%2FExtensions%2F1975120172)(): Column&lt;[T](index.md#1445138239%2FExtensions%2F1975120172)?&gt; |
| [optReference](index.md#-930485673%2FFunctions%2F1975120172) | [jvm]<br>fun &lt;[T](index.md#-930485673%2FFunctions%2F1975120172) : [Comparable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-comparable/index.md)&lt;[T](index.md#-930485673%2FFunctions%2F1975120172)&gt;&gt; [optReference](index.md#-930485673%2FFunctions%2F1975120172)(name: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.md), foreign: IdTable&lt;[T](index.md#-930485673%2FFunctions%2F1975120172)&gt;, onDelete: ReferenceOption?, onUpdate: ReferenceOption?, fkName: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.md)?): Column&lt;EntityID&lt;[T](index.md#-930485673%2FFunctions%2F1975120172)&gt;?&gt;<br>fun &lt;[T](index.md#478693009%2FFunctions%2F1975120172) : [Comparable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-comparable/index.md)&lt;[T](index.md#478693009%2FFunctions%2F1975120172)&gt;&gt; [optReference](index.md#478693009%2FFunctions%2F1975120172)(name: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.md), refColumn: Column&lt;[T](index.md#478693009%2FFunctions%2F1975120172)&gt;, onDelete: ReferenceOption?, onUpdate: ReferenceOption?, fkName: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.md)?): Column&lt;[T](index.md#478693009%2FFunctions%2F1975120172)?&gt;<br>fun &lt;[T](index.md#37241246%2FFunctions%2F1975120172) : [Comparable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-comparable/index.md)&lt;[T](index.md#37241246%2FFunctions%2F1975120172)&gt;, [E](index.md#37241246%2FFunctions%2F1975120172) : EntityID&lt;[T](index.md#37241246%2FFunctions%2F1975120172)&gt;&gt; [optReference](index.md#37241246%2FFunctions%2F1975120172)(name: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.md), refColumn: Column&lt;[E](index.md#37241246%2FFunctions%2F1975120172)&gt;, onDelete: ReferenceOption?, onUpdate: ReferenceOption?, fkName: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.md)?): Column&lt;[E](index.md#37241246%2FFunctions%2F1975120172)?&gt; |
| [reference](index.md#1107315878%2FFunctions%2F1975120172) | [jvm]<br>fun &lt;[T](index.md#1107315878%2FFunctions%2F1975120172) : [Comparable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-comparable/index.md)&lt;[T](index.md#1107315878%2FFunctions%2F1975120172)&gt;&gt; [reference](index.md#1107315878%2FFunctions%2F1975120172)(name: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.md), foreign: IdTable&lt;[T](index.md#1107315878%2FFunctions%2F1975120172)&gt;, onDelete: ReferenceOption?, onUpdate: ReferenceOption?, fkName: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.md)?): Column&lt;EntityID&lt;[T](index.md#1107315878%2FFunctions%2F1975120172)&gt;&gt;<br>fun &lt;[T](index.md#1148332128%2FFunctions%2F1975120172) : [Comparable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-comparable/index.md)&lt;[T](index.md#1148332128%2FFunctions%2F1975120172)&gt;&gt; [reference](index.md#1148332128%2FFunctions%2F1975120172)(name: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.md), refColumn: Column&lt;[T](index.md#1148332128%2FFunctions%2F1975120172)&gt;, onDelete: ReferenceOption?, onUpdate: ReferenceOption?, fkName: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.md)?): Column&lt;[T](index.md#1148332128%2FFunctions%2F1975120172)&gt;<br>fun &lt;[T](index.md#-439391507%2FFunctions%2F1975120172) : [Comparable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-comparable/index.md)&lt;[T](index.md#-439391507%2FFunctions%2F1975120172)&gt;, [E](index.md#-439391507%2FFunctions%2F1975120172) : EntityID&lt;[T](index.md#-439391507%2FFunctions%2F1975120172)&gt;&gt; [reference](index.md#-439391507%2FFunctions%2F1975120172)(name: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.md), refColumn: Column&lt;[E](index.md#-439391507%2FFunctions%2F1975120172)&gt;, onDelete: ReferenceOption?, onUpdate: ReferenceOption?, fkName: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.md)?): Column&lt;[E](index.md#-439391507%2FFunctions%2F1975120172)&gt; |
| [references](index.md#1648963011%2FExtensions%2F1975120172) | [jvm]<br>infix fun &lt;[T](index.md#1648963011%2FExtensions%2F1975120172) : [Comparable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-comparable/index.md)&lt;[T](index.md#1648963011%2FExtensions%2F1975120172)&gt;, [S](index.md#1648963011%2FExtensions%2F1975120172) : [T](index.md#1648963011%2FExtensions%2F1975120172), [C](index.md#1648963011%2FExtensions%2F1975120172) : Column&lt;[S](index.md#1648963011%2FExtensions%2F1975120172)&gt;&gt; [C](index.md#1648963011%2FExtensions%2F1975120172).[references](index.md#1648963011%2FExtensions%2F1975120172)(ref: Column&lt;[T](index.md#1648963011%2FExtensions%2F1975120172)&gt;): [C](index.md#1648963011%2FExtensions%2F1975120172)<br>fun &lt;[T](index.md#125179067%2FExtensions%2F1975120172) : [Comparable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-comparable/index.md)&lt;[T](index.md#125179067%2FExtensions%2F1975120172)&gt;, [S](index.md#125179067%2FExtensions%2F1975120172) : [T](index.md#125179067%2FExtensions%2F1975120172), [C](index.md#125179067%2FExtensions%2F1975120172) : Column&lt;[S](index.md#125179067%2FExtensions%2F1975120172)&gt;&gt; [C](index.md#125179067%2FExtensions%2F1975120172).[references](index.md#125179067%2FExtensions%2F1975120172)(ref: Column&lt;[T](index.md#125179067%2FExtensions%2F1975120172)&gt;, onDelete: ReferenceOption?, onUpdate: ReferenceOption?, fkName: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.md)?): [C](index.md#125179067%2FExtensions%2F1975120172)<br>fun &lt;[T](index.md#1785396338%2FExtensions%2F1975120172) : [Comparable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-comparable/index.md)&lt;[T](index.md#1785396338%2FExtensions%2F1975120172)&gt;, [S](index.md#1785396338%2FExtensions%2F1975120172) : [T](index.md#1785396338%2FExtensions%2F1975120172), [C](index.md#1785396338%2FExtensions%2F1975120172) : Column&lt;[S](index.md#1785396338%2FExtensions%2F1975120172)&gt;&gt; [C](index.md#1785396338%2FExtensions%2F1975120172).[references](index.md#1785396338%2FExtensions%2F1975120172)(ref: Column&lt;EntityID&lt;[T](index.md#1785396338%2FExtensions%2F1975120172)&gt;&gt;, onDelete: ReferenceOption?, onUpdate: ReferenceOption?, fkName: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.md)?): [C](index.md#1785396338%2FExtensions%2F1975120172) |
| [registerColumn](index.md#-1341512564%2FFunctions%2F1975120172) | [jvm]<br>fun &lt;[T](index.md#-1341512564%2FFunctions%2F1975120172)&gt; [registerColumn](index.md#-1341512564%2FFunctions%2F1975120172)(name: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.md), type: IColumnType): Column&lt;[T](index.md#-1341512564%2FFunctions%2F1975120172)&gt; |
| [registerCompositeColumn](index.md#1191287290%2FFunctions%2F1975120172) | [jvm]<br>fun &lt;[R](index.md#1191287290%2FFunctions%2F1975120172), [T](index.md#1191287290%2FFunctions%2F1975120172) : CompositeColumn&lt;[R](index.md#1191287290%2FFunctions%2F1975120172)&gt;&gt; [registerCompositeColumn](index.md#1191287290%2FFunctions%2F1975120172)(column: [T](index.md#1191287290%2FFunctions%2F1975120172)): [T](index.md#1191287290%2FFunctions%2F1975120172) |
| [replaceColumn](index.md#270889164%2FFunctions%2F1975120172) | [jvm]<br>fun &lt;[TColumn](index.md#270889164%2FFunctions%2F1975120172) : Column&lt;*&gt;&gt; [replaceColumn](index.md#270889164%2FFunctions%2F1975120172)(oldColumn: Column&lt;*&gt;, newColumn: [TColumn](index.md#270889164%2FFunctions%2F1975120172)): [TColumn](index.md#270889164%2FFunctions%2F1975120172) |
| [rightJoin](index.md#2072823933%2FFunctions%2F1975120172) | [jvm]<br>open infix override fun [rightJoin](index.md#2072823933%2FFunctions%2F1975120172)(otherTable: ColumnSet): Join |
| [short](index.md#56930769%2FFunctions%2F1975120172) | [jvm]<br>fun [short](index.md#56930769%2FFunctions%2F1975120172)(name: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.md)): Column&lt;[Short](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-short/index.md)&gt; |
| [slice](index.md#1462474289%2FFunctions%2F1975120172) | [jvm]<br>fun [slice](index.md#1462474289%2FFunctions%2F1975120172)(columns: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.md)&lt;Expression&lt;*&gt;&gt;): FieldSet<br>fun [slice](index.md#-1167701894%2FFunctions%2F1975120172)(column: Expression&lt;*&gt;, vararg columns: Expression&lt;*&gt;): FieldSet |
| [text](index.md#-60221748%2FFunctions%2F1975120172) | [jvm]<br>fun [text](index.md#-60221748%2FFunctions%2F1975120172)(name: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.md), collate: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.md)?, eagerLoading: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.md)): Column&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.md)&gt; |
| [ubyte](index.md#116876178%2FFunctions%2F1975120172) | [jvm]<br>fun [ubyte](index.md#116876178%2FFunctions%2F1975120172)(name: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.md)): Column&lt;[UByte](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-u-byte/index.md)&gt; |
| [uinteger](index.md#-857680862%2FFunctions%2F1975120172) | [jvm]<br>fun [uinteger](index.md#-857680862%2FFunctions%2F1975120172)(name: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.md)): Column&lt;[UInt](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-u-int/index.md)&gt; |
| [ulong](index.md#1509429766%2FFunctions%2F1975120172) | [jvm]<br>fun [ulong](index.md#1509429766%2FFunctions%2F1975120172)(name: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.md)): Column&lt;[ULong](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-u-long/index.md)&gt; |
| [uniqueIndex](index.md#-1434313059%2FFunctions%2F1975120172) | [jvm]<br>fun [uniqueIndex](index.md#-1434313059%2FFunctions%2F1975120172)(vararg columns: Column&lt;*&gt;, filterCondition: FilterCondition)<br>fun [uniqueIndex](index.md#252970649%2FFunctions%2F1975120172)(customIndexName: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.md)?, vararg columns: Column&lt;*&gt;, functions: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.md)&lt;ExpressionWithColumnType&lt;*&gt;&gt;?, filterCondition: FilterCondition) |
| [uniqueIndex](index.md#-17665861%2FExtensions%2F1975120172) | [jvm]<br>fun &lt;[T](index.md#-17665861%2FExtensions%2F1975120172)&gt; Column&lt;[T](index.md#-17665861%2FExtensions%2F1975120172)&gt;.[uniqueIndex](index.md#-17665861%2FExtensions%2F1975120172)(customIndexName: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.md)?): Column&lt;[T](index.md#-17665861%2FExtensions%2F1975120172)&gt; |
| [ushort](index.md#1116378144%2FFunctions%2F1975120172) | [jvm]<br>fun [ushort](index.md#1116378144%2FFunctions%2F1975120172)(name: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.md)): Column&lt;[UShort](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-u-short/index.md)&gt; |
| [uuid](index.md#154288180%2FFunctions%2F1975120172) | [jvm]<br>fun [uuid](index.md#154288180%2FFunctions%2F1975120172)(name: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.md)): Column&lt;[UUID](https://docs.oracle.com/javase/8/docs/api/java/util/UUID.md)&gt; |
| [varchar](index.md#1923632435%2FFunctions%2F1975120172) | [jvm]<br>fun [varchar](index.md#1923632435%2FFunctions%2F1975120172)(name: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.md), length: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.md), collate: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.md)?): Column&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.md)&gt; |
