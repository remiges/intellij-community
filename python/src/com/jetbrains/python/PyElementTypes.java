package com.jetbrains.python;

import com.intellij.psi.tree.TokenSet;
import com.jetbrains.python.psi.*;
import com.jetbrains.python.psi.impl.*;
import com.jetbrains.python.psi.impl.stubs.*;
import com.jetbrains.python.psi.stubs.*;

public interface PyElementTypes {

  PyStubElementType<PyFunctionStub, PyFunction> FUNCTION_DECLARATION = new PyFunctionElementType();
  PyStubElementType<PyClassStub, PyClass> CLASS_DECLARATION = new PyClassElementType();
  PyStubElementType<PyParameterListStub, PyParameterList> PARAMETER_LIST = new PyParameterListElementType();

  PyStubElementType<PyDecoratorListStub, PyDecoratorList> DECORATOR_LIST = new PyDecoratorListElementType();

  TokenSet PARAMETER_LIST_SET = TokenSet.create(PARAMETER_LIST);  

  PyStubElementType<PyNamedParameterStub, PyNamedParameter> NAMED_PARAMETER = new PyNamedParameterElementType();
  PyStubElementType<PyTupleParameterStub, PyTupleParameter> TUPLE_PARAMETER = new PyTupleParameterElementType();
  PyStubElementType<PySingleStarParameterStub, PySingleStarParameter> SINGLE_STAR_PARAMETER = new PySingleStarParameterElementType();

  TokenSet PARAMETERS = TokenSet.create(NAMED_PARAMETER, TUPLE_PARAMETER, SINGLE_STAR_PARAMETER);

  PyStubElementType<PyDecoratorStub, PyDecorator> DECORATOR_CALL = new PyDecoratorCallElementType();

  TokenSet FORMAL_PARAMETER_SET = TokenSet.create(NAMED_PARAMETER);

  PyElementType ARGUMENT_LIST = new PyElementType("ARGUMENT_LIST", PyArgumentListImpl.class);

  PyStubElementType<PyImportElementStub, PyImportElement> IMPORT_ELEMENT = new PyImportElementElementType();
  
  PyElementType STAR_IMPORT_ELEMENT = new PyElementType("STAR_IMPORT_ELEMENT", PyStarImportElementImpl.class);
  PyStubElementType<PyExceptPartStub, PyExceptPart> EXCEPT_PART = new PyExceptPartElementType();
  PyElementType PRINT_TARGET = new PyElementType("PRINT_TARGET", PyPrintTargetImpl.class);
  PyElementType DECORATOR = new PyElementType("DECORATOR", PyDecoratorImpl.class);

  // Statements
  PyElementType EXPRESSION_STATEMENT = new PyElementType("EXPRESSION_STATEMENT", PyExpressionStatementImpl.class);
  PyElementType ASSIGNMENT_STATEMENT = new PyElementType("ASSIGNMENT_STATEMENT", PyAssignmentStatementImpl.class);
  PyElementType AUG_ASSIGNMENT_STATEMENT = new PyElementType("AUG_ASSIGNMENT_STATEMENT", PyAugAssignmentStatementImpl.class);
  PyElementType ASSERT_STATEMENT = new PyElementType("ASSERT_STATEMENT", PyAssertStatementImpl.class);
  PyElementType BREAK_STATEMENT = new PyElementType("BREAK_STATEMENT", PyBreakStatementImpl.class);
  PyElementType CONTINUE_STATEMENT = new PyElementType("CONTINUE_STATEMENT", PyContinueStatementImpl.class);
  PyElementType DEL_STATEMENT = new PyElementType("DEL_STATEMENT", PyDelStatementImpl.class);
  PyElementType EXEC_STATEMENT = new PyElementType("EXEC_STATEMENT", PyExecStatementImpl.class);
  PyElementType FOR_STATEMENT = new PyElementType("FOR_STATEMENT", PyForStatementImpl.class);

  PyStubElementType<PyFromImportStatementStub, PyFromImportStatement> FROM_IMPORT_STATEMENT = new PyFromImportStatementElementType();
  PyStubElementType<PyImportStatementStub, PyImportStatement> IMPORT_STATEMENT = new PyImportStatementElementType();

  PyElementType GLOBAL_STATEMENT = new PyElementType("GLOBAL_STATEMENT", PyGlobalStatementImpl.class);
  PyElementType IF_STATEMENT = new PyElementType("IF_STATEMENT", PyIfStatementImpl.class);
  PyElementType PASS_STATEMENT = new PyElementType("PASS_STATEMENT", PyPassStatementImpl.class);
  PyElementType PRINT_STATEMENT = new PyElementType("PRINT_STATEMENT", PyPrintStatementImpl.class);
  PyElementType RAISE_STATEMENT = new PyElementType("RAISE_STATEMENT", PyRaiseStatementImpl.class);
  PyElementType RETURN_STATEMENT = new PyElementType("RETURN_STATEMENT", PyReturnStatementImpl.class);
  PyElementType TRY_EXCEPT_STATEMENT = new PyElementType("TRY_EXCEPT_STATEMENT", PyTryExceptStatementImpl.class);
  PyElementType WITH_STATEMENT = new PyElementType("WITH_STATEMENT", PyWithStatementImpl.class);
  PyElementType WHILE_STATEMENT = new PyElementType("WHILE_STATEMENT", PyWhileStatementImpl.class);
  PyElementType STATEMENT_LIST = new PyElementType("STATEMENT_LIST", PyStatementListImpl.class);

  PyElementType NONLOCAL_STATEMENT = new PyElementType("NONLOCAL_STATEMENT", PyNonlocalStatementImpl.class);

  PyElementType WITH_ITEM = new PyElementType("WITH_ITEM", PyWithItemImpl.class);

  TokenSet STATEMENTS = TokenSet.create(EXPRESSION_STATEMENT, ASSIGNMENT_STATEMENT, AUG_ASSIGNMENT_STATEMENT, ASSERT_STATEMENT,
                                        BREAK_STATEMENT, CONTINUE_STATEMENT, DEL_STATEMENT, EXEC_STATEMENT, FOR_STATEMENT,
                                        FROM_IMPORT_STATEMENT, GLOBAL_STATEMENT, IMPORT_STATEMENT, IF_STATEMENT, PASS_STATEMENT,
                                        PRINT_STATEMENT, RAISE_STATEMENT, RETURN_STATEMENT, TRY_EXCEPT_STATEMENT, WITH_STATEMENT,
                                        WHILE_STATEMENT, NONLOCAL_STATEMENT, CLASS_DECLARATION, FUNCTION_DECLARATION);

  TokenSet LOOPS = TokenSet.create(WHILE_STATEMENT, FOR_STATEMENT);

  // Expressions
  PyElementType EMPTY_EXPRESSION = new PyElementType("EMPTY_EXPRESSION", PyEmptyExpressionImpl.class);
  PyElementType REFERENCE_EXPRESSION = new PyElementType("REFERENCE_EXPRESSION", PyReferenceExpressionImpl.class);

  TokenSet REFERENCE_EXPRESSION_SET = TokenSet.create(REFERENCE_EXPRESSION);

  PyStubElementType<PyTargetExpressionStub, PyTargetExpression> TARGET_EXPRESSION = new PyTargetExpressionElementType();
  PyElementType INTEGER_LITERAL_EXPRESSION = new PyElementType("INTEGER_LITERAL_EXPRESSION", PyNumericLiteralExpressionImpl.class);
  PyElementType FLOAT_LITERAL_EXPRESSION = new PyElementType("FLOAT_LITERAL_EXPRESSION", PyNumericLiteralExpressionImpl.class);
  PyElementType IMAGINARY_LITERAL_EXPRESSION = new PyElementType("IMAGINARY_LITERAL_EXPRESSION", PyNumericLiteralExpressionImpl.class);
  PyElementType STRING_LITERAL_EXPRESSION = new PyElementType("STRING_LITERAL_EXPRESSION", PyStringLiteralExpressionImpl.class);
  PyElementType NONE_LITERAL_EXPRESSION = new PyElementType("NONE_LITERAL_EXPRESSION", PyNoneLiteralExpressionImpl.class);
  PyElementType BOOL_LITERAL_EXPRESSION = new PyElementType("BOOL_LITERAL_EXPRESSION", PyBoolLiteralExpressionImpl.class);
  PyElementType PARENTHESIZED_EXPRESSION = new PyElementType("PARENTHESIZED_EXPRESSION", PyParenthesizedExpressionImpl.class);
  PyElementType SUBSCRIPTION_EXPRESSION = new PyElementType("SUBSCRIPTION_EXPRESSION", PySubscriptionExpressionImpl.class);
  PyElementType SLICE_EXPRESSION = new PyElementType("SLICE_EXPRESSION", PySliceExpressionImpl.class);
  PyElementType SLICE_ITEM = new PyElementType("SLICE_ITEM", PySliceItemImpl.class);
  PyElementType BINARY_EXPRESSION = new PyElementType("BINARY_EXPRESSION", PyBinaryExpressionImpl.class);
  PyElementType PREFIX_EXPRESSION = new PyElementType("PREFIX_EXPRESSION", PyPrefixExpressionImpl.class);
  PyElementType CALL_EXPRESSION = new PyElementType("CALL_EXPRESSION", PyCallExpressionImpl.class);
  PyElementType LIST_LITERAL_EXPRESSION = new PyElementType("LIST_LITERAL_EXPRESSION", PyListLiteralExpressionImpl.class);
  PyElementType TUPLE_EXPRESSION = new PyElementType("TUPLE_EXPRESSION", PyTupleExpressionImpl.class);
  PyElementType KEYWORD_ARGUMENT_EXPRESSION = new PyElementType("KEYWORD_ARGUMENT_EXPRESSION", PyKeywordArgumentImpl.class);
  PyElementType STAR_ARGUMENT_EXPRESSION = new PyElementType("STAR_ARGUMENT_EXPRESSION", PyStarArgumentImpl.class);
  PyElementType LAMBDA_EXPRESSION = new PyElementType("LAMBDA_EXPRESSION", PyLambdaExpressionImpl.class);
  PyElementType LIST_COMP_EXPRESSION = new PyElementType("LIST_COMP_EXPRESSION", PyListCompExpressionImpl.class);
  PyElementType DICT_LITERAL_EXPRESSION = new PyElementType("DICT_LITERAL_EXPRESSION", PyDictLiteralExpressionImpl.class);
  PyElementType KEY_VALUE_EXPRESSION = new PyElementType("KEY_VALUE_EXPRESSION", PyKeyValueExpressionImpl.class);
  PyElementType REPR_EXPRESSION = new PyElementType("REPR_EXPRESSION", PyReprExpressionImpl.class);
  PyElementType GENERATOR_EXPRESSION = new PyElementType("GENERATOR_EXPRESSION", PyGeneratorExpressionImpl.class);
  PyElementType CONDITIONAL_EXPRESSION = new PyElementType("CONDITIONAL_EXPRESSION", PyConditionalExpressionImpl.class);
  PyElementType YIELD_EXPRESSION = new PyElementType("YIELD_EXPRESSION", PyYieldExpressionImpl.class);
  PyElementType STAR_EXPRESSION = new PyElementType("STAR_EXPRESSION", PyStarExpressionImpl.class);

  PyElementType SET_LITERAL_EXPRESSION = new PyElementType("SET_LITERAL_EXPRESSION", PySetLiteralExpressionImpl.class);
  PyElementType SET_COMP_EXPRESSION = new PyElementType("SET_COMP_EXPRESSION", PySetCompExpressionImpl.class);
  PyElementType DICT_COMP_EXPRESSION = new PyElementType("DICT_COMP_EXPRESSION", PyDictCompExpressionImpl.class);
  PyElementType ANNOTATION = new PyElementType("ANNOTATION", PyAnnotationImpl.class);

  TokenSet EXPRESSIONS = TokenSet.create(EMPTY_EXPRESSION, REFERENCE_EXPRESSION, INTEGER_LITERAL_EXPRESSION, FLOAT_LITERAL_EXPRESSION,
                                         IMAGINARY_LITERAL_EXPRESSION, STRING_LITERAL_EXPRESSION, PARENTHESIZED_EXPRESSION,
                                         SUBSCRIPTION_EXPRESSION, SLICE_EXPRESSION, BINARY_EXPRESSION, PREFIX_EXPRESSION, CALL_EXPRESSION,
                                         LIST_LITERAL_EXPRESSION, TUPLE_EXPRESSION, KEYWORD_ARGUMENT_EXPRESSION, STAR_ARGUMENT_EXPRESSION,
                                         LAMBDA_EXPRESSION, LIST_COMP_EXPRESSION, DICT_LITERAL_EXPRESSION, KEY_VALUE_EXPRESSION,
                                         REPR_EXPRESSION, GENERATOR_EXPRESSION, CONDITIONAL_EXPRESSION, YIELD_EXPRESSION,
                                         TARGET_EXPRESSION, NONE_LITERAL_EXPRESSION, BOOL_LITERAL_EXPRESSION,
                                         SET_LITERAL_EXPRESSION, SET_COMP_EXPRESSION, DICT_COMP_EXPRESSION, STAR_EXPRESSION);

  TokenSet LIST_LIKE_EXPRESSIONS = TokenSet.create(LIST_LITERAL_EXPRESSION, LIST_COMP_EXPRESSION, TUPLE_EXPRESSION);

  TokenSet STATEMENT_LISTS = TokenSet.create(STATEMENT_LIST);

  TokenSet BINARY_OPS = TokenSet.create(PyTokenTypes.OR_KEYWORD, PyTokenTypes.AND_KEYWORD, PyTokenTypes.LT, PyTokenTypes.GT,
                                        PyTokenTypes.OR, PyTokenTypes.XOR, PyTokenTypes.AND, PyTokenTypes.LTLT, PyTokenTypes.GTGT,
                                        PyTokenTypes.EQEQ, PyTokenTypes.GE, PyTokenTypes.LE, PyTokenTypes.NE, PyTokenTypes.NE_OLD,
                                        PyTokenTypes.IN_KEYWORD, PyTokenTypes.IS_KEYWORD, PyTokenTypes.NOT_KEYWORD, PyTokenTypes.PLUS,
                                        PyTokenTypes.MINUS, PyTokenTypes.MULT, PyTokenTypes.FLOORDIV, PyTokenTypes.DIV, PyTokenTypes.PERC);

  TokenSet UNARY_OPS = TokenSet.create(PyTokenTypes.NOT_KEYWORD, PyTokenTypes.PLUS, PyTokenTypes.MINUS, PyTokenTypes.TILDE);

  // Parts
  PyElementType IF_PART_IF = new PyElementType("IF_IF", PyIfPartIfImpl.class);
  PyElementType IF_PART_ELIF = new PyElementType("IF_ELIF", PyIfPartElifImpl.class);

  PyElementType FOR_PART = new PyElementType("FOR_PART", PyForPartImpl.class);
  PyElementType WHILE_PART = new PyElementType("WHILE_PART", PyWhilePartImpl.class);

  PyElementType TRY_PART = new PyElementType("TRY_PART", PyTryPartImpl.class);
  PyElementType FINALLY_PART = new PyElementType("FINALLY_PART", PyFinallyPartImpl.class);

  PyElementType ELSE_PART = new PyElementType("ELSE_PART", PyElsePartImpl.class);

  TokenSet PARTS = TokenSet.create(IF_PART_IF, IF_PART_ELIF, FOR_PART, WHILE_PART, TRY_PART, FINALLY_PART, ELSE_PART); 
  TokenSet ELIFS = TokenSet.create(IF_PART_ELIF);

}
