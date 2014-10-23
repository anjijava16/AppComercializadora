package POJOS;
// Generated 23-oct-2014 8:25:39 by Hibernate Tools 3.6.0


import java.math.BigDecimal;
import java.util.Date;

/**
 * CxPDetaCompra generated by hbm2java
 */
public class CxPDetaCompra  implements java.io.Serializable {


     private CxPDetaCompraId id;
     private String codInsRel;
     private BigDecimal qtyPed;
     private BigDecimal qtyRec;
     private BigDecimal valIns;
     private BigDecimal margenIva;
     private BigDecimal valIva;
     private BigDecimal margenDes;
     private BigDecimal valDes;
     private char estCom;
     private String codUsu;
     private Date fecSys;
     private String codIva;
     private BigDecimal qtydev;
     private BigDecimal valinsSiniva;
     private BigDecimal qtyDañada;
     private BigDecimal qtySendProv;
     private String lote;
     private BigDecimal margenIco;
     private BigDecimal valIco;
     private BigDecimal margenUtil;
     private String ordenItem;
     private BigDecimal valFleteUnd;

    public CxPDetaCompra() {
    }

	
    public CxPDetaCompra(CxPDetaCompraId id, String codInsRel, BigDecimal qtyPed, BigDecimal qtyRec, BigDecimal valIns, BigDecimal margenIva, BigDecimal valIva, BigDecimal valDes, char estCom, String codUsu, Date fecSys, String codIva, BigDecimal qtydev, BigDecimal valinsSiniva, BigDecimal qtyDañada, BigDecimal qtySendProv, String lote, BigDecimal margenIco, BigDecimal valIco, BigDecimal margenUtil, String ordenItem, BigDecimal valFleteUnd) {
        this.id = id;
        this.codInsRel = codInsRel;
        this.qtyPed = qtyPed;
        this.qtyRec = qtyRec;
        this.valIns = valIns;
        this.margenIva = margenIva;
        this.valIva = valIva;
        this.valDes = valDes;
        this.estCom = estCom;
        this.codUsu = codUsu;
        this.fecSys = fecSys;
        this.codIva = codIva;
        this.qtydev = qtydev;
        this.valinsSiniva = valinsSiniva;
        this.qtyDañada = qtyDañada;
        this.qtySendProv = qtySendProv;
        this.lote = lote;
        this.margenIco = margenIco;
        this.valIco = valIco;
        this.margenUtil = margenUtil;
        this.ordenItem = ordenItem;
        this.valFleteUnd = valFleteUnd;
    }
    public CxPDetaCompra(CxPDetaCompraId id, String codInsRel, BigDecimal qtyPed, BigDecimal qtyRec, BigDecimal valIns, BigDecimal margenIva, BigDecimal valIva, BigDecimal margenDes, BigDecimal valDes, char estCom, String codUsu, Date fecSys, String codIva, BigDecimal qtydev, BigDecimal valinsSiniva, BigDecimal qtyDañada, BigDecimal qtySendProv, String lote, BigDecimal margenIco, BigDecimal valIco, BigDecimal margenUtil, String ordenItem, BigDecimal valFleteUnd) {
       this.id = id;
       this.codInsRel = codInsRel;
       this.qtyPed = qtyPed;
       this.qtyRec = qtyRec;
       this.valIns = valIns;
       this.margenIva = margenIva;
       this.valIva = valIva;
       this.margenDes = margenDes;
       this.valDes = valDes;
       this.estCom = estCom;
       this.codUsu = codUsu;
       this.fecSys = fecSys;
       this.codIva = codIva;
       this.qtydev = qtydev;
       this.valinsSiniva = valinsSiniva;
       this.qtyDañada = qtyDañada;
       this.qtySendProv = qtySendProv;
       this.lote = lote;
       this.margenIco = margenIco;
       this.valIco = valIco;
       this.margenUtil = margenUtil;
       this.ordenItem = ordenItem;
       this.valFleteUnd = valFleteUnd;
    }
   
    public CxPDetaCompraId getId() {
        return this.id;
    }
    
    public void setId(CxPDetaCompraId id) {
        this.id = id;
    }
    public String getCodInsRel() {
        return this.codInsRel;
    }
    
    public void setCodInsRel(String codInsRel) {
        this.codInsRel = codInsRel;
    }
    public BigDecimal getQtyPed() {
        return this.qtyPed;
    }
    
    public void setQtyPed(BigDecimal qtyPed) {
        this.qtyPed = qtyPed;
    }
    public BigDecimal getQtyRec() {
        return this.qtyRec;
    }
    
    public void setQtyRec(BigDecimal qtyRec) {
        this.qtyRec = qtyRec;
    }
    public BigDecimal getValIns() {
        return this.valIns;
    }
    
    public void setValIns(BigDecimal valIns) {
        this.valIns = valIns;
    }
    public BigDecimal getMargenIva() {
        return this.margenIva;
    }
    
    public void setMargenIva(BigDecimal margenIva) {
        this.margenIva = margenIva;
    }
    public BigDecimal getValIva() {
        return this.valIva;
    }
    
    public void setValIva(BigDecimal valIva) {
        this.valIva = valIva;
    }
    public BigDecimal getMargenDes() {
        return this.margenDes;
    }
    
    public void setMargenDes(BigDecimal margenDes) {
        this.margenDes = margenDes;
    }
    public BigDecimal getValDes() {
        return this.valDes;
    }
    
    public void setValDes(BigDecimal valDes) {
        this.valDes = valDes;
    }
    public char getEstCom() {
        return this.estCom;
    }
    
    public void setEstCom(char estCom) {
        this.estCom = estCom;
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
    public String getCodIva() {
        return this.codIva;
    }
    
    public void setCodIva(String codIva) {
        this.codIva = codIva;
    }
    public BigDecimal getQtydev() {
        return this.qtydev;
    }
    
    public void setQtydev(BigDecimal qtydev) {
        this.qtydev = qtydev;
    }
    public BigDecimal getValinsSiniva() {
        return this.valinsSiniva;
    }
    
    public void setValinsSiniva(BigDecimal valinsSiniva) {
        this.valinsSiniva = valinsSiniva;
    }
    public BigDecimal getQtyDañada() {
        return this.qtyDañada;
    }
    
    public void setQtyDañada(BigDecimal qtyDañada) {
        this.qtyDañada = qtyDañada;
    }
    public BigDecimal getQtySendProv() {
        return this.qtySendProv;
    }
    
    public void setQtySendProv(BigDecimal qtySendProv) {
        this.qtySendProv = qtySendProv;
    }
    public String getLote() {
        return this.lote;
    }
    
    public void setLote(String lote) {
        this.lote = lote;
    }
    public BigDecimal getMargenIco() {
        return this.margenIco;
    }
    
    public void setMargenIco(BigDecimal margenIco) {
        this.margenIco = margenIco;
    }
    public BigDecimal getValIco() {
        return this.valIco;
    }
    
    public void setValIco(BigDecimal valIco) {
        this.valIco = valIco;
    }
    public BigDecimal getMargenUtil() {
        return this.margenUtil;
    }
    
    public void setMargenUtil(BigDecimal margenUtil) {
        this.margenUtil = margenUtil;
    }
    public String getOrdenItem() {
        return this.ordenItem;
    }
    
    public void setOrdenItem(String ordenItem) {
        this.ordenItem = ordenItem;
    }
    public BigDecimal getValFleteUnd() {
        return this.valFleteUnd;
    }
    
    public void setValFleteUnd(BigDecimal valFleteUnd) {
        this.valFleteUnd = valFleteUnd;
    }




}


