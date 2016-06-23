/* Generated By:JavaCC: Do not edit this line. HTMLParserConstants.java */
package html;

public interface HTMLParserConstants {

  int EOF = 0;
  int ScriptStart = 1;
  int TagName = 2;
  int DeclName = 3;
  int Comment1 = 4;
  int Comment2 = 5;
  int Word = 6;
  int LET = 7;
  int NUM = 8;
  int Entity = 9;
  int Space = 10;
  int SP = 11;
  int Punct = 12;
  int ScriptText = 13;
  int ScriptEnd = 14;
  int ArgName = 15;
  int ArgEquals = 16;
  int TagEnd = 17;
  int ArgValue = 18;
  int ArgQuote1 = 19;
  int ArgQuote2 = 20;
  int Quote1Text = 22;
  int CloseQuote1 = 23;
  int Quote2Text = 24;
  int CloseQuote2 = 25;
  int CommentText1 = 26;
  int CommentEnd1 = 27;
  int CommentText2 = 28;
  int CommentEnd2 = 29;

  int DEFAULT = 0;
  int WithinScript = 1;
  int WithinTag = 2;
  int AfterEquals = 3;
  int WithinQuote1 = 4;
  int WithinQuote2 = 5;
  int WithinComment1 = 6;
  int WithinComment2 = 7;

  String[] tokenImage = {
    "<EOF>",
    "\"<script\"",
    "<TagName>",
    "<DeclName>",
    "\"<!--\"",
    "\"<!\"",
    "<Word>",
    "<LET>",
    "<NUM>",
    "<Entity>",
    "<Space>",
    "<SP>",
    "<Punct>",
    "<ScriptText>",
    "<ScriptEnd>",
    "<ArgName>",
    "\"=\"",
    "<TagEnd>",
    "<ArgValue>",
    "\"\\\'\"",
    "\"\\\"\"",
    "<token of kind 21>",
    "<Quote1Text>",
    "<CloseQuote1>",
    "<Quote2Text>",
    "<CloseQuote2>",
    "<CommentText1>",
    "\"-->\"",
    "<CommentText2>",
    "\">\"",
  };

}
