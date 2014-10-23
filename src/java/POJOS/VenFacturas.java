package POJOS;
// Generated 23-oct-2014 8:25:39 by Hibernate Tools 3.6.0


import java.math.BigDecimal;
import java.util.Date;

/**
 * VenFacturas generated by hbm2java
 */
public class VenFacturas  implements java.io.Serializable {


     private VenFacturasId id;
     private Date fecFac;
     private Date fecVen;
     private String codcli;
     private String codter;
     private String codven;
     private String codList;
     private String codCaja;
     private BigDecimal valVta;
     private BigDecimal valIva;
     private BigDecimal valAbo;
     private BigDecimal valDcto;
     private BigDecimal valRet;
     private BigDecimal valRica;
     private BigDecimal valRiva;
     private BigDecimal valCosto;
     private BigDecimal valNeto;
     private BigDecimal fpEfectivo;
     private BigDecimal fpTd;
     private BigDecimal fpTc;
     private BigDecimal fpCh;
     private BigDecimal fpCr;
     private BigDecimal fpAnticipo;
     private BigDecimal fpOtr;
     private String codUsu;
     private Date fecSys;
     private String horsys;
     private Character estado;
     private String systemSrx;
     private String codRes;
     private byte swFp;
     private String systemDbx;
     private String codAlm;
     private String tipFac;
     private String numFac;
     private BigDecimal vrefpagado;
     private BigDecimal vrefcambio;
     private String numTurno;
     private boolean vbConta;
     private String codsuc;
     private Date fecent;
     private BigDecimal margenpropina;
     private BigDecimal fpNc;
     private String codzona;
     private BigDecimal valAiu;

    public VenFacturas() {
    }

	
    public VenFacturas(VenFacturasId id, String systemSrx, String codRes, byte swFp, String systemDbx, String codAlm, String tipFac, String numFac, BigDecimal vrefpagado, BigDecimal vrefcambio, String numTurno, boolean vbConta, String codsuc, BigDecimal margenpropina, BigDecimal fpNc, String codzona, BigDecimal valAiu) {
        this.id = id;
        this.systemSrx = systemSrx;
        this.codRes = codRes;
        this.swFp = swFp;
        this.systemDbx = systemDbx;
        this.codAlm = codAlm;
        this.tipFac = tipFac;
        this.numFac = numFac;
        this.vrefpagado = vrefpagado;
        this.vrefcambio = vrefcambio;
        this.numTurno = numTurno;
        this.vbConta = vbConta;
        this.codsuc = codsuc;
        this.margenpropina = margenpropina;
        this.fpNc = fpNc;
        this.codzona = codzona;
        this.valAiu = valAiu;
    }
    public VenFacturas(VenFacturasId id, Date fecFac, Date fecVen, String codcli, String codter, String codven, String codList, String codCaja, BigDecimal valVta, BigDecimal valIva, BigDecimal valAbo, BigDecimal valDcto, BigDecimal valRet, BigDecimal valRica, BigDecimal valRiva, BigDecimal valCosto, BigDecimal valNeto, BigDecimal fpEfectivo, BigDecimal fpTd, BigDecimal fpTc, BigDecimal fpCh, BigDecimal fpCr, BigDecimal fpAnticipo, BigDecimal fpOtr, String codUsu, Date fecSys, String horsys, Character estado, String systemSrx, String codRes, byte swFp, String systemDbx, String codAlm, String tipFac, String numFac, BigDecimal vrefpagado, BigDecimal vrefcambio, String numTurno, boolean vbConta, String codsuc, Date fecent, BigDecimal margenpropina, BigDecimal fpNc, String codzona, BigDecimal valAiu) {
       this.id = id;
       this.fecFac = fecFac;
       this.fecVen = fecVen;
       this.codcli = codcli;
       this.codter = codter;
       this.codven = codven;
       this.codList = codList;
       this.codCaja = codCaja;
       this.valVta = valVta;
       this.valIva = valIva;
       this.valAbo = valAbo;
       this.valDcto = valDcto;
       this.valRet = valRet;
       this.valRica = valRica;
       this.valRiva = valRiva;
       this.valCosto = valCosto;
       this.valNeto = valNeto;
       this.fpEfectivo = fpEfectivo;
       this.fpTd = fpTd;
       this.fpTc = fpTc;
       this.fpCh = fpCh;
       this.fpCr = fpCr;
       this.fpAnticipo = fpAnticipo;
       this.fpOtr = fpOtr;
       this.codUsu = codUsu;
       this.fecSys = fecSys;
       this.horsys = horsys;
       this.estado = estado;
       this.systemSrx = systemSrx;
       this.codRes = codRes;
       this.swFp = swFp;
       this.systemDbx = systemDbx;
       this.codAlm = codAlm;
       this.tipFac = tipFac;
       this.numFac = numFac;
       this.vrefpagado = vrefpagado;
       this.vrefcambio = vrefcambio;
       this.numTurno = numTurno;
       this.vbConta = vbConta;
       this.codsuc = codsuc;
       this.fecent = fecent;
       this.margenpropina = margenpropina;
       this.fpNc = fpNc;
       this.codzona = codzona;
       this.valAiu = valAiu;
    }
   
    public VenFacturasId getId() {
        return this.id;
    }
    
    public void setId(VenFacturasId id) {
        this.id = id;
    }
    public Date getFecFac() {
        return this.fecFac;
    }
    
    public void setFecFac(Date fecFac) {
        this.fecFac = fecFac;
    }
    public Date getFecVen() {
        return this.fecVen;
    }
    
    public void setFecVen(Date fecVen) {
        this.fecVen = fecVen;
    }
    public String getCodcli() {
        return this.codcli;
    }
    
    public void setCodcli(String codcli) {
        this.codcli = codcli;
    }
    public String getCodter() {
        return this.codter;
    }
    
    public void setCodter(String codter) {
        this.codter = codter;
    }
    public String getCodven() {
        return this.codven;
    }
    
    public void setCodven(String codven) {
        this.codven = codven;
    }
    public String getCodList() {
        return this.codList;
    }
    
    public void setCodList(String codList) {
        this.codList = codList;
    }
    public String getCodCaja() {
        return this.codCaja;
    }
    
    public void setCodCaja(String codCaja) {
        this.codCaja = codCaja;
    }
    public BigDecimal getValVta() {
        return this.valVta;
    }
    
    public void setValVta(BigDecimal valVta) {
        this.valVta = valVta;
    }
    public BigDecimal getValIva() {
        return this.valIva;
    }
    
    public void setValIva(BigDecimal valIva) {
        this.valIva = valIva;
    }
    public BigDecimal getValAbo() {
        return this.valAbo;
    }
    
    public void setValAbo(BigDecimal valAbo) {
        this.valAbo = valAbo;
    }
    public BigDecimal getValDcto() {
        return this.valDcto;
    }
    
    public void setValDcto(BigDecimal valDcto) {
        this.valDcto = valDcto;
    }
    public BigDecimal getValRet() {
        return this.valRet;
    }
    
    public void setValRet(BigDecimal valRet) {
        this.valRet = valRet;
    }
    public BigDecimal getValRica() {
        return this.valRica;
    }
    
    public void setValRica(BigDecimal valRica) {
        this.valRica = valRica;
    }
    public BigDecimal getValRiva() {
        return this.valRiva;
    }
    
    public void setValRiva(BigDecimal valRiva) {
        this.valRiva = valRiva;
    }
    public BigDecimal getValCosto() {
        return this.valCosto;
    }
    
    public void setValCosto(BigDecimal valCosto) {
        this.valCosto = valCosto;
    }
    public BigDecimal getValNeto() {
        return this.valNeto;
    }
    
    public void setValNeto(BigDecimal valNeto) {
        this.valNeto = valNeto;
    }
    public BigDecimal getFpEfectivo() {
        return this.fpEfectivo;
    }
    
    public void setFpEfectivo(BigDecimal fpEfectivo) {
        this.fpEfectivo = fpEfectivo;
    }
    public BigDecimal getFpTd() {
        return this.fpTd;
    }
    
    public void setFpTd(BigDecimal fpTd) {
        this.fpTd = fpTd;
    }
    public BigDecimal getFpTc() {
        return this.fpTc;
    }
    
    public void setFpTc(BigDecimal fpTc) {
        this.fpTc = fpTc;
    }
    public BigDecimal getFpCh() {
        return this.fpCh;
    }
    
    public void setFpCh(BigDecimal fpCh) {
        this.fpCh = fpCh;
    }
    public BigDecimal getFpCr() {
        return this.fpCr;
    }
    
    public void setFpCr(BigDecimal fpCr) {
        this.fpCr = fpCr;
    }
    public BigDecimal getFpAnticipo() {
        return this.fpAnticipo;
    }
    
    public void setFpAnticipo(BigDecimal fpAnticipo) {
        this.fpAnticipo = fpAnticipo;
    }
    public BigDecimal getFpOtr() {
        return this.fpOtr;
    }
    
    public void setFpOtr(BigDecimal fpOtr) {
        this.fpOtr = fpOtr;
    }
    public String getCodUsu() {
        return this.codUsu;
    }
    
    public void setCodUsu(String codUsu) {
        this.codUsu = codUsu;
    }
    public Date getFecSys() {
        return this.fecSys;
    }
    
    public void setFecSys(Date fecSys) {
        this.fecSys = fecSys;
    }
    public String getHorsys() {
        return this.horsys;
    }
    
    public void setHorsys(String horsys) {
        this.horsys = horsys;
    }
    public Character getEstado() {
        return this.estado;
    }
    
    public void setEstado(Character estado) {
        this.estado = estado;
    }
    public String getSystemSrx() {
        return this.systemSrx;
    }
    
    public void setSystemSrx(String systemSrx) {
        this.systemSrx = systemSrx;
    }
    public String getCodRes() {
        return this.codRes;
    }
    
    public void setCodRes(String codRes) {
        this.codRes = codRes;
    }
    public byte getSwFp() {
        return this.swFp;
    }
    
    public void setSwFp(byte swFp) {
        this.swFp = swFp;
    }
    public String getSystemDbx() {
        return this.systemDbx;
    }
    
    public void setSystemDbx(String systemDbx) {
        this.systemDbx = systemDbx;
    }
    public String getCodAlm() {
        return this.codAlm;
    }
    
    public void setCodAlm(String codAlm) {
        this.codAlm = codAlm;
    }
    public String getTipFac() {
        return this.tipFac;
    }
    
    public void setTipFac(String tipFac) {
        this.tipFac = tipFac;
    }
    public String getNumFac() {
        return this.numFac;
    }
    
    public void setNumFac(String numFac) {
        this.numFac = numFac;
    }
    public BigDecimal getVrefpagado() {
        return this.vrefpagado;
    }
    
    public void setVrefpagado(BigDecimal vrefpagado) {
        this.vrefpagado = vrefpagado;
    }
    public BigDecimal getVrefcambio() {
        return this.vrefcambio;
    }
    
    public void setVrefcambio(BigDecimal vrefcambio) {
        this.vrefcambio = vrefcambio;
    }
    public String getNumTurno() {
        return this.numTurno;
    }
    
    public void setNumTurno(String numTurno) {
        this.numTurno = numTurno;
    }
    public boolean isVbConta() {
        return this.vbConta;
    }
    
    public void setVbConta(boolean vbConta) {
        this.vbConta = vbConta;
    }
    public String getCodsuc() {
        return this.codsuc;
    }
    
    public void setCodsuc(String codsuc) {
        this.codsuc = codsuc;
    }
    public Date getFecent() {
        return this.fecent;
    }
    
    public void setFecent(Date fecent) {
        this.fecent = fecent;
    }
    public BigDecimal getMargenpropina() {
        return this.margenpropina;
    }
    
    public void setMargenpropina(BigDecimal margenpropina) {
        this.margenpropina = margenpropina;
    }
    public BigDecimal getFpNc() {
        return this.fpNc;
    }
    
    public void setFpNc(BigDecimal fpNc) {
        this.fpNc = fpNc;
    }
    public String getCodzona() {
        return this.codzona;
    }
    
    public void setCodzona(String codzona) {
        this.codzona = codzona;
    }
    public BigDecimal getValAiu() {
        return this.valAiu;
    }
    
    public void setValAiu(BigDecimal valAiu) {
        this.valAiu = valAiu;
    }




}


