/*
 * Copyright 2017 BeDataDriven Groep BV
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file
 * except in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the
 * License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF
 * ANY KIND, either express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.bedatadriven.spss;

import java.io.IOException;

class VersionHeader {

  static final int EXTENDED_RECORD_TYPE = 3;

  private int versionMajor;
  private int versionMinor;
  private int revision;
  private int machine;
  private int floating;
  private int compression;
  private int endianness;
  private int character;

  public VersionHeader(SpssInputStream inputStream) throws IOException {
    versionMajor = inputStream.readInt();
    versionMinor = inputStream.readInt();
    revision = inputStream.readInt();
    machine = inputStream.readInt();
    floating = inputStream.readInt();
    compression = inputStream.readInt();
    endianness = inputStream.readInt();
    character = inputStream.readInt();
  }
  public String getCharacterName() {
    switch( character ) {
      case 1: return "Cp1047";
      case 2: return "Cp1252";
      case 37: return "IBM037";
      case 437: return "IBM437";
      case 500: return "IBM500";
      case 708: return "ASMO-708";
      case 720: return "DOS-720";
      case 737: return "ibm737";
      case 775: return "ibm775";
      case 850: return "ibm850";
      case 852: return "ibm852";
      case 855: return "IBM855";
      case 857: return "ibm857";
      case 858: return "IBM00858";
      case 860: return "IBM860";
      case 861: return "ibm861";
      case 862: return "DOS-862";
      case 863: return "IBM863";
      case 864: return "IBM864";
      case 865: return "IBM865";
      case 866: return "cp866";
      case 869: return "ibm869";
      case 870: return "IBM870";
      case 874: return "windows-874";
      case 875: return "cp875";
      case 932: return "shift_jis";
      case 936: return "gb2312";
      case 949: return "ks_c_5601-1987";
      case 950: return "big5";
      case 1026: return "IBM1026";
      case 1047: return "IBM01047";
      case 1140: return "IBM01140";
      case 1141: return "IBM01141";
      case 1142: return "IBM01142";
      case 1143: return "IBM01143";
      case 1144: return "IBM01144";
      case 1145: return "IBM01145";
      case 1146: return "IBM01146";
      case 1147: return "IBM01147";
      case 1148: return "IBM01148";
      case 1149: return "IBM01149";
      case 1200: return "utf-16";
      case 1201: return "utf-16BE";
      case 1250: return "windows-1250";
      case 1251: return "windows-1251";
      case 1252: return "Windows-1252";
      case 1253: return "windows-1253";
      case 1254: return "windows-1254";
      case 1255: return "windows-1255";
      case 1256: return "windows-1256";
      case 1257: return "windows-1257";
      case 1258: return "windows-1258";
      case 1361: return "Johab";
      case 10000: return "macintosh";
      case 10001: return "x-mac-japanese";
      case 10002: return "x-mac-chinesetrad";
      case 10003: return "x-mac-korean";
      case 10004: return "x-mac-arabic";
      case 10005: return "x-mac-hebrew";
      case 10006: return "x-mac-greek";
      case 10007: return "x-mac-cyrillic";
      case 10008: return "x-mac-chinesesimp";
      case 10010: return "x-mac-romanian";
      case 10017: return "x-mac-ukrainian";
      case 10021: return "x-mac-thai";
      case 10029: return "x-mac-ce";
      case 10079: return "x-mac-icelandic";
      case 10081: return "x-mac-turkish";
      case 10082: return "x-mac-croatian";
      case 12000: return "utf-32";
      case 12001: return "utf-32BE";
      case 20000: return "x-Chinese-CNS";
      case 20001: return "x-cp20001";
      case 20002: return "x-Chinese-Eten";
      case 20003: return "x-cp20003";
      case 20004: return "x-cp20004";
      case 20005: return "x-cp20005";
      case 20105: return "x-IA5";
      case 20106: return "x-IA5-German";
      case 20107: return "x-IA5-Swedish";
      case 20108: return "x-IA5-Norwegian";
      case 20127: return "us-ascii";
      case 20261: return "x-cp20261";
      case 20269: return "x-cp20269";
      case 20273: return "IBM273";
      case 20277: return "IBM277";
      case 20278: return "IBM278";
      case 20280: return "IBM280";
      case 20284: return "IBM284";
      case 20285: return "IBM285";
      case 20290: return "IBM290";
      case 20297: return "IBM297";
      case 20420: return "IBM420";
      case 20423: return "IBM423";
      case 20424: return "IBM424";
      case 20833: return "x-EBCDIC-KoreanExtended";
      case 20838: return "IBM-Thai";
      case 20866: return "koi8-r";
      case 20871: return "IBM871";
      case 20880: return "IBM880";
      case 20905: return "IBM905";
      case 20924: return "IBM00924";
      case 20932: return "EUC-JP";
      case 20936: return "x-cp20936";
      case 20949: return "x-cp20949";
      case 21025: return "cp1025";
      case 21866: return "koi8-u";
      case 28591: return "iso-8859-1";
      case 28592: return "iso-8859-2";
      case 28593: return "iso-8859-3";
      case 28594: return "iso-8859-4";
      case 28595: return "iso-8859-5";
      case 28596: return "iso-8859-6";
      case 28597: return "iso-8859-7";
      case 28598: return "iso-8859-8";
      case 28599: return "iso-8859-9";
      case 28603: return "iso-8859-13";
      case 28605: return "iso-8859-15";
      case 29001: return "x-Europa";
      case 38598: return "iso-8859-8-i";
      case 50220: return "iso-2022-jp";
      case 50221: return "csISO2022JP";
      case 50222: return "iso-2022-jp";
      case 50225: return "iso-2022-kr";
      case 50227: return "x-cp50227";
      case 51932: return "euc-jp";
      case 51936: return "EUC-CN";
      case 51949: return "euc-kr";
      case 52936: return "hz-gb-2312";
      case 54936: return "GB18030";
      case 57002: return "x-iscii-de";
      case 57003: return "x-iscii-be";
      case 57004: return "x-iscii-ta";
      case 57005: return "x-iscii-te";
      case 57006: return "x-iscii-as";
      case 57007: return "x-iscii-or";
      case 57008: return "x-iscii-ka";
      case 57009: return "x-iscii-ma";
      case 57010: return "x-iscii-gu";
      case 57011: return "x-iscii-pa";
      case 65000: return "utf-7";
      case 65001: return "utf-8";
      default: return "Cp1252";
    }
  }

}
