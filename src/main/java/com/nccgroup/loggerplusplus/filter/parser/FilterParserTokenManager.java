/* Generated By:JJTree&JavaCC: Do not edit this line. FilterParserTokenManager.java */
package com.nccgroup.loggerplusplus.filter.parser;

/**
 * Token Manager.
 */
public class FilterParserTokenManager implements FilterParserConstants {

   /** Debug output. */
   public java.io.PrintStream debugStream = System.out;

   /** Set debug output. */
   public void setDebugStream(java.io.PrintStream ds) {
      debugStream = ds;
   }

   private int jjStopAtPos(int pos, int kind) {
      jjmatchedKind = kind;
      jjmatchedPos = pos;
      return pos + 1;
   }

   private int jjMoveStringLiteralDfa0_0() {
      switch (curChar) {
         case 32:
            jjmatchedKind = 1;
            return jjMoveNfa_0(0, 0);
         case 33:
            return jjMoveStringLiteralDfa1_0(0x8L);
         case 34:
            jjmatchedKind = 29;
            return jjMoveNfa_0(0, 0);
      case 35:
         jjmatchedKind = 27;
         return jjMoveNfa_0(0, 0);
      case 39:
         jjmatchedKind = 28;
         return jjMoveNfa_0(0, 0);
      case 40:
         jjmatchedKind = 19;
         return jjMoveNfa_0(0, 0);
      case 41:
         jjmatchedKind = 20;
         return jjMoveNfa_0(0, 0);
      case 44:
         jjmatchedKind = 26;
         return jjMoveNfa_0(0, 0);
      case 46:
         jjmatchedKind = 22;
         return jjMoveNfa_0(0, 0);
      case 60:
         jjmatchedKind = 5;
         return jjMoveStringLiteralDfa1_0(0x80L);
      case 62:
         jjmatchedKind = 4;
         return jjMoveStringLiteralDfa1_0(0x40L);
      case 67:
         return jjMoveStringLiteralDfa1_0(0x800L);
      case 73:
         return jjMoveStringLiteralDfa1_0(0x1000L);
      case 77:
         return jjMoveStringLiteralDfa1_0(0x40000L);
      case 91:
         jjmatchedKind = 24;
         return jjMoveNfa_0(0, 0);
      case 93:
         jjmatchedKind = 25;
         return jjMoveNfa_0(0, 0);
         case 99:
            return jjMoveStringLiteralDfa1_0(0x800L);
         case 105:
            return jjMoveStringLiteralDfa1_0(0x1000L);
         case 109:
            return jjMoveStringLiteralDfa1_0(0x40000L);
         default:
            return jjMoveNfa_0(0, 0);
      }
   }

   private int jjMoveStringLiteralDfa1_0(long active0) {
      try {
         curChar = input_stream.readChar();
      } catch (java.io.IOException e) {
         return jjMoveNfa_0(0, 0);
      }
      switch (curChar) {
         case 61:
            if ((active0 & 0x8L) != 0L) {
               jjmatchedKind = 3;
            jjmatchedPos = 1;
         }
         else if ((active0 & 0x40L) != 0L)
         {
            jjmatchedKind = 6;
            jjmatchedPos = 1;
         }
         else if ((active0 & 0x80L) != 0L)
         {
            jjmatchedKind = 7;
            jjmatchedPos = 1;
         }
         break;
      case 65:
         return jjMoveStringLiteralDfa2_0(active0, 0x40000L);
      case 78:
         if ((active0 & 0x1000L) != 0L)
         {
            jjmatchedKind = 12;
            jjmatchedPos = 1;
         }
         break;
      case 79:
         return jjMoveStringLiteralDfa2_0(active0, 0x800L);
      case 97:
         return jjMoveStringLiteralDfa2_0(active0, 0x40000L);
      case 110:
         if ((active0 & 0x1000L) != 0L)
         {
            jjmatchedKind = 12;
            jjmatchedPos = 1;
         }
         break;
         case 111:
            return jjMoveStringLiteralDfa2_0(active0, 0x800L);
         default:
            break;
      }
      return jjMoveNfa_0(0, 1);
   }

   private int jjMoveStringLiteralDfa2_0(long old0, long active0) {
      if (((active0 &= old0)) == 0L)
         return jjMoveNfa_0(0, 1);
      try {
         curChar = input_stream.readChar();
      } catch (java.io.IOException e) {
         return jjMoveNfa_0(0, 1);
      }
      switch (curChar) {
         case 78:
            return jjMoveStringLiteralDfa3_0(active0, 0x800L);
      case 84:
         return jjMoveStringLiteralDfa3_0(active0, 0x40000L);
         case 110:
            return jjMoveStringLiteralDfa3_0(active0, 0x800L);
         case 116:
            return jjMoveStringLiteralDfa3_0(active0, 0x40000L);
         default:
            break;
      }
      return jjMoveNfa_0(0, 2);
   }

   private int jjMoveStringLiteralDfa3_0(long old0, long active0) {
      if (((active0 &= old0)) == 0L)
         return jjMoveNfa_0(0, 2);
      try {
         curChar = input_stream.readChar();
      } catch (java.io.IOException e) {
         return jjMoveNfa_0(0, 2);
      }
      switch (curChar) {
         case 67:
            return jjMoveStringLiteralDfa4_0(active0, 0x40000L);
      case 84:
         return jjMoveStringLiteralDfa4_0(active0, 0x800L);
         case 99:
            return jjMoveStringLiteralDfa4_0(active0, 0x40000L);
         case 116:
            return jjMoveStringLiteralDfa4_0(active0, 0x800L);
         default:
            break;
      }
      return jjMoveNfa_0(0, 3);
   }

   private int jjMoveStringLiteralDfa4_0(long old0, long active0) {
      if (((active0 &= old0)) == 0L)
         return jjMoveNfa_0(0, 3);
      try {
         curChar = input_stream.readChar();
      } catch (java.io.IOException e) {
         return jjMoveNfa_0(0, 3);
      }
      switch (curChar) {
         case 65:
            return jjMoveStringLiteralDfa5_0(active0, 0x800L);
      case 72:
         return jjMoveStringLiteralDfa5_0(active0, 0x40000L);
         case 97:
            return jjMoveStringLiteralDfa5_0(active0, 0x800L);
         case 104:
            return jjMoveStringLiteralDfa5_0(active0, 0x40000L);
         default:
            break;
      }
      return jjMoveNfa_0(0, 4);
   }

   private int jjMoveStringLiteralDfa5_0(long old0, long active0) {
      if (((active0 &= old0)) == 0L)
         return jjMoveNfa_0(0, 4);
      try {
         curChar = input_stream.readChar();
      } catch (java.io.IOException e) {
         return jjMoveNfa_0(0, 4);
      }
      switch (curChar) {
         case 69:
            return jjMoveStringLiteralDfa6_0(active0, 0x40000L);
      case 73:
         return jjMoveStringLiteralDfa6_0(active0, 0x800L);
         case 101:
            return jjMoveStringLiteralDfa6_0(active0, 0x40000L);
         case 105:
            return jjMoveStringLiteralDfa6_0(active0, 0x800L);
         default:
            break;
      }
      return jjMoveNfa_0(0, 5);
   }

   private int jjMoveStringLiteralDfa6_0(long old0, long active0) {
      if (((active0 &= old0)) == 0L)
         return jjMoveNfa_0(0, 5);
      try {
         curChar = input_stream.readChar();
      } catch (java.io.IOException e) {
         return jjMoveNfa_0(0, 5);
      }
      switch (curChar) {
         case 78:
            return jjMoveStringLiteralDfa7_0(active0, 0x800L);
      case 83:
         if ((active0 & 0x40000L) != 0L)
         {
            jjmatchedKind = 18;
            jjmatchedPos = 6;
         }
         break;
      case 110:
         return jjMoveStringLiteralDfa7_0(active0, 0x800L);
      case 115:
         if ((active0 & 0x40000L) != 0L) {
            jjmatchedKind = 18;
            jjmatchedPos = 6;
         }
         break;
         default:
            break;
      }
      return jjMoveNfa_0(0, 6);
   }

   private int jjMoveStringLiteralDfa7_0(long old0, long active0) {
      if (((active0 &= old0)) == 0L)
         return jjMoveNfa_0(0, 6);
      try {
         curChar = input_stream.readChar();
      } catch (java.io.IOException e) {
         return jjMoveNfa_0(0, 6);
      }
      switch (curChar) {
         case 83:
            if ((active0 & 0x800L) != 0L)
         {
            jjmatchedKind = 11;
            jjmatchedPos = 7;
         }
         break;
      case 115:
         if ((active0 & 0x800L) != 0L)
         {
            jjmatchedKind = 11;
            jjmatchedPos = 7;
         }
         break;
      default :
         break;
   }
   return jjMoveNfa_0(0, 7);
}
static final long[] jjbitVec0 = {
   0xfffffffffffffffeL, 0xffffffffffffffffL, 0xffffffffffffffffL, 0xffffffffffffffffL
};
static final long[] jjbitVec2 = {
   0x0L, 0x0L, 0xffffffffffffffffL, 0xffffffffffffffffL
};
private int jjMoveNfa_0(int startState, int curPos)
{
   int strKind = jjmatchedKind;
   int strPos = jjmatchedPos;
   int seenUpto;
   input_stream.backup(seenUpto = curPos + 1);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) { throw new Error("Internal Error"); }
   curPos = 0;
   int startsAt = 0;
   jjnewStateCnt = 49;
   int i = 1;
   jjstateSet[0] = startState;
   int kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         do
         {
            switch(jjstateSet[--i])
            {
               case 0:
                  if ((0x3ff000000000000L & l) != 0L)
                  {
                     if (kind > 14)
                        kind = 14;
                     jjCheckNAddTwoStates(27, 28);
                  }
                  else if ((0x280000000000L & l) != 0L)
                     jjCheckNAdd(27);
                  else if (curChar == 33)
                  {
                     if (kind > 21)
                        kind = 21;
                  }
                  else if (curChar == 47)
                     jjCheckNAddTwoStates(40, 42);
                  else if (curChar == 38)
                     jjstateSet[jjnewStateCnt++] = 9;
                  else if (curChar == 61)
                     jjstateSet[jjnewStateCnt++] = 1;
                  if ((0x3ff000000000000L & l) != 0L)
                  {
                     if (kind > 23)
                        kind = 23;
                     jjCheckNAdd(48);
                  }
                  else if (curChar == 47)
                     jjstateSet[jjnewStateCnt++] = 37;
                  else if (curChar == 38)
                  {
                     if (kind > 9)
                        kind = 9;
                  }
                  else if (curChar == 61)
                  {
                     if (kind > 2)
                        kind = 2;
                  }
                  break;
               case 1:
                  if (curChar == 61 && kind > 2)
                     kind = 2;
                  break;
               case 2:
                  if (curChar == 61)
                     jjstateSet[jjnewStateCnt++] = 1;
                  break;
               case 8:
               case 9:
                  if (curChar == 38 && kind > 9)
                     kind = 9;
                  break;
               case 10:
                  if (curChar == 38)
                     jjstateSet[jjnewStateCnt++] = 9;
                  break;
               case 26:
                  if ((0x280000000000L & l) != 0L)
                     jjCheckNAdd(27);
                  break;
               case 27:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 14)
                     kind = 14;
                  jjCheckNAddTwoStates(27, 28);
                  break;
               case 28:
                  if (curChar == 46)
                     jjCheckNAdd(29);
                  break;
               case 29:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 14)
                     kind = 14;
                  jjCheckNAdd(29);
                  break;
               case 32:
               case 33:
                  jjCheckNAddStates(0, 2);
                  break;
               case 34:
                  if (curChar == 47 && kind > 16)
                     kind = 16;
                  break;
               case 38:
                  if (curChar == 47)
                     jjstateSet[jjnewStateCnt++] = 37;
                  break;
               case 39:
                  if (curChar == 47)
                     jjCheckNAddTwoStates(40, 42);
                  break;
               case 41:
                  jjCheckNAddStates(3, 5);
                  break;
               case 42:
                  if ((0xffff7fffffffffffL & l) != 0L)
                     jjCheckNAddStates(3, 5);
                  break;
               case 43:
                  if (curChar == 47 && kind > 17)
                     kind = 17;
                  break;
               case 44:
                  if (curChar == 33 && kind > 21)
                     kind = 21;
                  break;
               case 48:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 23)
                     kind = 23;
                  jjCheckNAdd(48);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 0:
                  if ((0x7fffffe87fffffeL & l) != 0L)
                  {
                     if (kind > 23)
                        kind = 23;
                     jjCheckNAdd(48);
                  }
                  else if (curChar == 94)
                  {
                     if (kind > 10)
                        kind = 10;
                  }
                  else if (curChar == 124)
                     jjstateSet[jjnewStateCnt++] = 4;
                  if ((0x400000004000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 46;
                  else if ((0x4000000040L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 24;
                  else if ((0x10000000100000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 20;
                  else if ((0x100000001000000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 16;
                  else if ((0x200000002L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 12;
                  else if ((0x800000008000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 6;
                  else if (curChar == 124)
                  {
                     if (kind > 8)
                        kind = 8;
                  }
                  break;
               case 3:
               case 4:
                  if (curChar == 124 && kind > 8)
                     kind = 8;
                  break;
               case 5:
                  if (curChar == 124)
                     jjstateSet[jjnewStateCnt++] = 4;
                  break;
               case 6:
                  if ((0x4000000040000L & l) != 0L && kind > 8)
                     kind = 8;
                  break;
               case 7:
                  if ((0x800000008000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 6;
                  break;
               case 11:
                  if ((0x1000000010L & l) != 0L && kind > 9)
                     kind = 9;
                  break;
               case 12:
                  if ((0x400000004000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 11;
                  break;
               case 13:
                  if ((0x200000002L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 12;
                  break;
               case 14:
                  if (curChar == 94 && kind > 10)
                     kind = 10;
                  break;
               case 15:
                  if ((0x4000000040000L & l) != 0L && kind > 10)
                     kind = 10;
                  break;
               case 16:
                  if ((0x800000008000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 15;
                  break;
               case 17:
                  if ((0x100000001000000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 16;
                  break;
               case 18:
                  if ((0x2000000020L & l) != 0L && kind > 13)
                     kind = 13;
                  break;
               case 19:
                  if ((0x20000000200000L & l) != 0L)
                     jjCheckNAdd(18);
                  break;
               case 20:
                  if ((0x4000000040000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 19;
                  break;
               case 21:
                  if ((0x10000000100000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 20;
                  break;
               case 22:
                  if ((0x8000000080000L & l) != 0L)
                     jjCheckNAdd(18);
                  break;
               case 23:
                  if ((0x100000001000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 22;
                  break;
               case 24:
                  if ((0x200000002L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 23;
                  break;
               case 25:
                  if ((0x4000000040L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 24;
                  break;
               case 30:
                  if ((0x2000000020000L & l) != 0L)
                     jjCheckNAddStates(0, 2);
                  break;
               case 31:
                  if (curChar == 92)
                     jjstateSet[jjnewStateCnt++] = 32;
                  break;
               case 32:
                  if ((0xffffffdfffffffdfL & l) != 0L)
                     jjCheckNAddStates(0, 2);
                  break;
               case 33:
                  if ((0xffffffffefffffffL & l) != 0L)
                     jjCheckNAddStates(0, 2);
                  break;
               case 35:
                  if ((0x2000000020L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 34;
                  break;
               case 36:
                  if (curChar == 92)
                     jjstateSet[jjnewStateCnt++] = 35;
                  break;
               case 37:
                  if (curChar == 92)
                     jjstateSet[jjnewStateCnt++] = 30;
                  break;
               case 40:
                  if (curChar == 92)
                     jjstateSet[jjnewStateCnt++] = 41;
                  break;
               case 41:
                  jjCheckNAddStates(3, 5);
                  break;
               case 42:
                  if ((0xffffffffefffffffL & l) != 0L)
                     jjCheckNAddStates(3, 5);
                  break;
               case 45:
                  if ((0x10000000100000L & l) != 0L && kind > 21)
                     kind = 21;
                  break;
               case 46:
                  if ((0x800000008000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 45;
                  break;
               case 47:
                  if ((0x400000004000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 46;
                  break;
               case 48:
                  if ((0x7fffffe87fffffeL & l) == 0L)
                     break;
                  if (kind > 23)
                     kind = 23;
                  jjCheckNAdd(48);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int hiByte = (int) (curChar >> 8);
         int i1 = hiByte >> 6;
         long l1 = 1L << (hiByte & 077);
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i]) {
               case 32:
               case 33:
                  if (jjCanMove_0(hiByte, i1, i2, l1, l2))
                     jjCheckNAddStates(0, 2);
                  break;
               case 41:
               case 42:
                  if (jjCanMove_0(hiByte, i1, i2, l1, l2))
                     jjCheckNAddStates(3, 5);
                  break;
               default:
                  break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 49 - (jjnewStateCnt = startsAt)))
         break;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { break; }
   }
   if (jjmatchedPos > strPos)
      return curPos;

   int toRet = Math.max(curPos, seenUpto);

   if (curPos < toRet)
      for (i = toRet - Math.min(curPos, seenUpto); i-- > 0; )
         try { curChar = input_stream.readChar(); }
         catch(java.io.IOException e) { throw new Error("Internal Error : Please send a bug report.");
         }

   if (jjmatchedPos < strPos) {
      jjmatchedKind = strKind;
      jjmatchedPos = strPos;
   } else if (jjmatchedPos == strPos && jjmatchedKind > strKind)
      jjmatchedKind = strKind;

   return toRet;
}

   private final int jjStopStringLiteralDfa_1(int pos, long active0) {
      switch (pos) {
         default:
            return -1;
      }
   }

   private final int jjStartNfa_1(int pos, long active0) {
      return jjMoveNfa_1(jjStopStringLiteralDfa_1(pos, active0), pos + 1);
   }

   private int jjMoveStringLiteralDfa0_1() {
      switch (curChar) {
         case 39:
            return jjStopAtPos(0, 31);
         default:
            return jjMoveNfa_1(3, 0);
      }
   }

   private int jjMoveNfa_1(int startState, int curPos)
{
   int startsAt = 0;
   jjnewStateCnt = 3;
   int i = 1;
   jjstateSet[0] = startState;
   int kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         do
         {
            switch(jjstateSet[--i])
            {
               case 3:
               case 2:
                  if ((0xffffff7fffffffffL & l) == 0L)
                     break;
                  if (kind > 30)
                     kind = 30;
                  jjCheckNAddTwoStates(0, 2);
                  break;
               case 1:
                  if (kind > 30)
                     kind = 30;
                  jjCheckNAddTwoStates(0, 2);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 3:
                  if ((0xffffffffefffffffL & l) != 0L)
                  {
                     if (kind > 30)
                        kind = 30;
                     jjCheckNAddTwoStates(0, 2);
                  }
                  else if (curChar == 92)
                     jjstateSet[jjnewStateCnt++] = 1;
                  break;
               case 0:
                  if (curChar == 92)
                     jjstateSet[jjnewStateCnt++] = 1;
                  break;
               case 1:
                  if (kind > 30)
                     kind = 30;
                  jjCheckNAddTwoStates(0, 2);
                  break;
               case 2:
                  if ((0xffffffffefffffffL & l) == 0L)
                     break;
                  if (kind > 30)
                     kind = 30;
                  jjCheckNAddTwoStates(0, 2);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int hiByte = (int) (curChar >> 8);
         int i1 = hiByte >> 6;
         long l1 = 1L << (hiByte & 077);
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i]) {
               case 3:
               case 2:
               case 1:
                  if (!jjCanMove_0(hiByte, i1, i2, l1, l2))
                     break;
                  if (kind > 30)
                     kind = 30;
                  jjCheckNAddTwoStates(0, 2);
                  break;
               default:
                  break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 3 - (jjnewStateCnt = startsAt)))
         return curPos;
      try {
         curChar = input_stream.readChar();
      } catch (java.io.IOException e) {
         return curPos;
      }
   }
}

   private final int jjStopStringLiteralDfa_2(int pos, long active0) {
      switch (pos) {
         default:
            return -1;
      }
   }

   private final int jjStartNfa_2(int pos, long active0) {
      return jjMoveNfa_2(jjStopStringLiteralDfa_2(pos, active0), pos + 1);
   }

   private int jjMoveStringLiteralDfa0_2() {
      switch (curChar) {
         case 34:
            return jjStopAtPos(0, 33);
         default:
            return jjMoveNfa_2(3, 0);
      }
   }

   private int jjMoveNfa_2(int startState, int curPos)
{
   int startsAt = 0;
   jjnewStateCnt = 3;
   int i = 1;
   jjstateSet[0] = startState;
   int kind = 0x7fffffff;
   for (;;) {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64) {
         long l = 1L << curChar;
         do {
            switch(jjstateSet[--i]) {
               case 3:
               case 2:
                  if ((0xfffffffbffffffffL & l) == 0L)
                     break;
                  if (kind > 32)
                     kind = 32;
                  jjCheckNAddTwoStates(0, 2);
                  break;
               case 1:
                  if (kind > 32)
                     kind = 32;
                  jjCheckNAddTwoStates(0, 2);
                  break;
               default : break;
            }
         } while(i != startsAt);
      } else if (curChar < 128) {
         long l = 1L << (curChar & 077);
         do {
            switch(jjstateSet[--i]) {
               case 3:
                  if ((0xffffffffefffffffL & l) != 0L) {
                     if (kind > 32)
                        kind = 32;
                     jjCheckNAddTwoStates(0, 2);
                  } else if (curChar == 92)
                     jjstateSet[jjnewStateCnt++] = 1;
                  break;
               case 0:
                  if (curChar == 92)
                     jjstateSet[jjnewStateCnt++] = 1;
                  break;
               case 1:
                  if (kind > 32)
                     kind = 32;
                  jjCheckNAddTwoStates(0, 2);
                  break;
               case 2:
                  if ((0xffffffffefffffffL & l) == 0L)
                     break;
                  if (kind > 32)
                     kind = 32;
                  jjCheckNAddTwoStates(0, 2);
                  break;
               default : break;
            }
         } while(i != startsAt);
      } else {
         int hiByte = (int) (curChar >> 8);
         int i1 = hiByte >> 6;
         long l1 = 1L << (hiByte & 077);
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         do {
            switch(jjstateSet[--i]) {
               case 3:
               case 2:
               case 1:
                  if (!jjCanMove_0(hiByte, i1, i2, l1, l2))
                     break;
                  if (kind > 32)
                     kind = 32;
                  jjCheckNAddTwoStates(0, 2);
                  break;
               default:
                  break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff) {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 3 - (jjnewStateCnt = startsAt)))
         return curPos;
      try {
         curChar = input_stream.readChar();
      } catch (java.io.IOException e) {
         return curPos;
      }
   }
}

   static final int[] jjnextStates = {
           31, 33, 36, 40, 42, 43,
   };

   private static final boolean jjCanMove_0(int hiByte, int i1, int i2, long l1, long l2) {
      switch (hiByte) {
         case 0:
            return ((jjbitVec2[i2] & l2) != 0L);
         default:
            if ((jjbitVec0[i1] & l1) != 0L)
               return true;
            return false;
      }
   }

   /**
    * Token literal values.
    */
   public static final String[] jjstrLiteralImages = {
           "", null, null, "\41\75", "\76", "\74", "\76\75", "\74\75", null, null, null,
           null, null, null, null, null, null, null, null, "\50", "\51", null, "\56", null,
           "\133", "\135", "\54", "\43", "\47", "\42", null, "\47", null, "\42", null,};

   /**
    * Lexer state names.
    */
   public static final String[] lexStateNames = {
           "DEFAULT",
           "SINGLE_QUOTED_STRING",
           "DOUBLE_QUOTED_STRING",
   };

   /**
    * Lex State array.
    */
   public static final int[] jjnewLexState = {
           -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
           -1, -1, -1, 1, 2, -1, 0, -1, 0, -1,
   };
   static final long[] jjtoToken = {
           0x7fffffffdL,
   };
   static final long[] jjtoSkip = {
           0x2L,
   };
   protected SimpleCharStream input_stream;
   private final int[] jjrounds = new int[49];
   private final int[] jjstateSet = new int[98];
   protected char curChar;

   /**
    * Constructor.
    */
   public FilterParserTokenManager(SimpleCharStream stream) {
      if (SimpleCharStream.staticFlag)
         throw new Error("ERROR: Cannot use a static CharStream class with a non-static lexical analyzer.");
      input_stream = stream;
   }

   /**
    * Constructor.
    */
   public FilterParserTokenManager(SimpleCharStream stream, int lexState) {
      this(stream);
      SwitchTo(lexState);
   }

   /**
    * Reinitialise parser.
    */
   public void ReInit(SimpleCharStream stream) {
      jjmatchedPos = jjnewStateCnt = 0;
      curLexState = defaultLexState;
      input_stream = stream;
      ReInitRounds();
   }

   private void ReInitRounds() {
      int i;
      jjround = 0x80000001;
      for (i = 49; i-- > 0; )
         jjrounds[i] = 0x80000000;
   }

   /**
    * Reinitialise parser.
    */
   public void ReInit(SimpleCharStream stream, int lexState) {
      ReInit(stream);
      SwitchTo(lexState);
   }

   /**
    * Switch to specified lex state.
    */
   public void SwitchTo(int lexState) {
      if (lexState >= 3 || lexState < 0)
         throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
      else
         curLexState = lexState;
   }

   protected Token jjFillToken() {
      final Token t;
      final String curTokenImage;
      final int beginLine;
      final int endLine;
      final int beginColumn;
      final int endColumn;
      String im = jjstrLiteralImages[jjmatchedKind];
   curTokenImage = (im == null) ? input_stream.GetImage() : im;
   beginLine = input_stream.getBeginLine();
   beginColumn = input_stream.getBeginColumn();
   endLine = input_stream.getEndLine();
   endColumn = input_stream.getEndColumn();
   t = Token.newToken(jjmatchedKind, curTokenImage);

   t.beginLine = beginLine;
   t.endLine = endLine;
   t.beginColumn = beginColumn;
   t.endColumn = endColumn;

   return t;
}

int curLexState = 0;
int defaultLexState = 0;
int jjnewStateCnt;
int jjround;
int jjmatchedPos;
int jjmatchedKind;

/** Get the next Token. */
public Token getNextToken() 
{
  Token matchedToken;
  int curPos = 0;

   EOFLoop:
   for (; ; ) {
      try {
         curChar = input_stream.BeginToken();
      } catch (java.io.IOException e)
   {
      jjmatchedKind = 0;
      matchedToken = jjFillToken();
      return matchedToken;
   }

   switch(curLexState)
   {
     case 0:
       jjmatchedKind = 0x7fffffff;
       jjmatchedPos = 0;
       curPos = jjMoveStringLiteralDfa0_0();
       if (jjmatchedPos == 0 && jjmatchedKind > 34)
       {
          jjmatchedKind = 34;
       }
       break;
     case 1:
       jjmatchedKind = 0x7fffffff;
       jjmatchedPos = 0;
       curPos = jjMoveStringLiteralDfa0_1();
       if (jjmatchedPos == 0 && jjmatchedKind > 34)
       {
          jjmatchedKind = 34;
       }
       break;
     case 2:
       jjmatchedKind = 0x7fffffff;
       jjmatchedPos = 0;
       curPos = jjMoveStringLiteralDfa0_2();
       if (jjmatchedPos == 0 && jjmatchedKind > 34)
       {
          jjmatchedKind = 34;
       }
       break;
   }
     if (jjmatchedKind != 0x7fffffff)
     {
        if (jjmatchedPos + 1 < curPos)
           input_stream.backup(curPos - jjmatchedPos - 1);
        if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
        {
           matchedToken = jjFillToken();
       if (jjnewLexState[jjmatchedKind] != -1)
         curLexState = jjnewLexState[jjmatchedKind];
           return matchedToken;
        }
        else
        {
         if (jjnewLexState[jjmatchedKind] != -1)
           curLexState = jjnewLexState[jjmatchedKind];
           continue EOFLoop;
        }
     }
     int error_line = input_stream.getEndLine();
     int error_column = input_stream.getEndColumn();
     String error_after = null;
     boolean EOFSeen = false;
     try { input_stream.readChar(); input_stream.backup(1); }
     catch (java.io.IOException e1) {
        EOFSeen = true;
        error_after = curPos <= 1 ? "" : input_stream.GetImage();
        if (curChar == '\n' || curChar == '\r') {
           error_line++;
           error_column = 0;
        }
        else
           error_column++;
     }
     if (!EOFSeen) {
        input_stream.backup(1);
        error_after = curPos <= 1 ? "" : input_stream.GetImage();
     }
     throw new TokenMgrError(EOFSeen, curLexState, error_line, error_column, error_after, curChar, TokenMgrError.LEXICAL_ERROR);
  }
}

private void jjCheckNAdd(int state)
{
   if (jjrounds[state] != jjround)
   {
      jjstateSet[jjnewStateCnt++] = state;
      jjrounds[state] = jjround;
   }
}
private void jjAddStates(int start, int end)
{
   do {
      jjstateSet[jjnewStateCnt++] = jjnextStates[start];
   } while (start++ != end);
}
private void jjCheckNAddTwoStates(int state1, int state2)
{
   jjCheckNAdd(state1);
   jjCheckNAdd(state2);
}

private void jjCheckNAddStates(int start, int end)
{
   do {
      jjCheckNAdd(jjnextStates[start]);
   } while (start++ != end);
}

}