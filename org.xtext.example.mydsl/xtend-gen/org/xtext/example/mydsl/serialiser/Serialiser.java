package org.xtext.example.mydsl.serialiser;

import Metamodell.Facet;
import Metamodell.Solid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.xtext.example.mydsl.serialiser.ByteConverter;

@SuppressWarnings("all")
public class Serialiser {
  public static String serialise2(final Solid s) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("COLOR=");
    byte[] _setBytes = ByteConverter.setBytes(127, 127, 127, 32);
    _builder.append(_setBytes);
    _builder.append("MATERIAL=");
    byte[] _setBytes_1 = ByteConverter.setBytes(127, 127, 127, 32);
    _builder.append(_setBytes_1);
    byte[] _setBytes_2 = ByteConverter.setBytes(127, 127, 127, 32);
    _builder.append(_setBytes_2);
    byte[] _setBytes_3 = ByteConverter.setBytes(127, 127, 127, 32);
    _builder.append(_setBytes_3);
    _builder.append("                                                 ");
    byte[] _intToByte = ByteConverter.intToByte(s.getFacets().size());
    _builder.append(_intToByte);
    {
      EList<Facet> _facets = s.getFacets();
      for(final Facet f : _facets) {
        byte[] _createBinary = ByteConverter.createBinary(f);
        _builder.append(_createBinary);
      }
    }
    return _builder.toString();
  }
}
