package POJOS;
// Generated 19-sep-2014 10:35:39 by Hibernate Tools 3.6.0


import java.math.BigDecimal;
import java.util.Date;

/**
 * AlmInsumos generated by hbm2java
 */
public class AlmInsumos  implements java.io.Serializable {


     private String codins;
     private String nomins;
     private String refins;
     private String undIns;
     private BigDecimal undxEmp;
     private String codLinea;
     private String codSub;
     private Character clase;
     private Boolean garantia;
     private Integer qtyDiasGar;
     private Boolean activo;
     private String fichaTec;
     private BigDecimal ucoins;
     private String codrap;
     private BigDecimal ultimoPrecio;
     private String codbar;
     private boolean consumoPeriodico;
     private boolean permitirFraccion;
     private String nitPro;
     private String codAnt;
     private String codIva;
     private boolean modificado;
     private String codCueIvaGen;
     private String codCueIvaDes;
     private String codCueAdivaGen;
     private String codCueAdivaDes;
     private String mlcodterp;
     private String mlcodclase;
     private String mlcodprod;
     private String mlcodtipo;
     private String codCueIngresos;
     private String codCueAdingresos;
     private String codCueCostos;
     private String codCueAdcostos;
     private String codCueInventario;
     private String codCueAdinventario;
     private String tmpnomline;
     private String tmpnomsub;
     private String numimp;
     private String descrip;
     private boolean controlbascula;
     private boolean plangim;
     private int plangimqtydias;
     private boolean plangimxsesion;
     private int plangimqtysesion;
     private String codmar;
     private String idcum;
     private BigDecimal boxAlto;
     private BigDecimal boxLargo;
     private BigDecimal boxAncho;
     private String ubiFisica;
     private String codUsuDescontinua;
     private Date fechaDescontinua;
     private BigDecimal boxPeso;
     private BigDecimal margenHipo;
     private BigDecimal margenIco;
     private String codIvaCxP;
     private BigDecimal margenIcocxP;
     private BigDecimal margenIcoven;
     private String codgrut;
     private boolean descargueSel;
     private String eanins;
     private boolean reqSerialInFac;
     private int qtySerial;
     private boolean infoExtendida;

    public AlmInsumos() {
    }

	
    public AlmInsumos(String codins, String codbar, boolean consumoPeriodico, boolean permitirFraccion, String nitPro, String codAnt, String codIva, boolean modificado, String codCueIvaGen, String codCueIvaDes, String codCueAdivaGen, String codCueAdivaDes, String mlcodterp, String mlcodclase, String mlcodprod, String mlcodtipo, String codCueIngresos, String codCueAdingresos, String codCueCostos, String codCueAdcostos, String codCueInventario, String codCueAdinventario, String tmpnomline, String tmpnomsub, String numimp, String descrip, boolean controlbascula, boolean plangim, int plangimqtydias, boolean plangimxsesion, int plangimqtysesion, String codmar, String idcum, BigDecimal boxAlto, BigDecimal boxLargo, BigDecimal boxAncho, String ubiFisica, String codUsuDescontinua, Date fechaDescontinua, BigDecimal boxPeso, BigDecimal margenHipo, BigDecimal margenIco, String codIvaCxP, BigDecimal margenIcocxP, BigDecimal margenIcoven, String codgrut, boolean descargueSel, String eanins, boolean reqSerialInFac, int qtySerial, boolean infoExtendida) {
        this.codins = codins;
        this.codbar = codbar;
        this.consumoPeriodico = consumoPeriodico;
        this.permitirFraccion = permitirFraccion;
        this.nitPro = nitPro;
        this.codAnt = codAnt;
        this.codIva = codIva;
        this.modificado = modificado;
        this.codCueIvaGen = codCueIvaGen;
        this.codCueIvaDes = codCueIvaDes;
        this.codCueAdivaGen = codCueAdivaGen;
        this.codCueAdivaDes = codCueAdivaDes;
        this.mlcodterp = mlcodterp;
        this.mlcodclase = mlcodclase;
        this.mlcodprod = mlcodprod;
        this.mlcodtipo = mlcodtipo;
        this.codCueIngresos = codCueIngresos;
        this.codCueAdingresos = codCueAdingresos;
        this.codCueCostos = codCueCostos;
        this.codCueAdcostos = codCueAdcostos;
        this.codCueInventario = codCueInventario;
        this.codCueAdinventario = codCueAdinventario;
        this.tmpnomline = tmpnomline;
        this.tmpnomsub = tmpnomsub;
        this.numimp = numimp;
        this.descrip = descrip;
        this.controlbascula = controlbascula;
        this.plangim = plangim;
        this.plangimqtydias = plangimqtydias;
        this.plangimxsesion = plangimxsesion;
        this.plangimqtysesion = plangimqtysesion;
        this.codmar = codmar;
        this.idcum = idcum;
        this.boxAlto = boxAlto;
        this.boxLargo = boxLargo;
        this.boxAncho = boxAncho;
        this.ubiFisica = ubiFisica;
        this.codUsuDescontinua = codUsuDescontinua;
        this.fechaDescontinua = fechaDescontinua;
        this.boxPeso = boxPeso;
        this.margenHipo = margenHipo;
        this.margenIco = margenIco;
        this.codIvaCxP = codIvaCxP;
        this.margenIcocxP = margenIcocxP;
        this.margenIcoven = margenIcoven;
        this.codgrut = codgrut;
        this.descargueSel = descargueSel;
        this.eanins = eanins;
        this.reqSerialInFac = reqSerialInFac;
        this.qtySerial = qtySerial;
        this.infoExtendida = infoExtendida;
    }
    public AlmInsumos(String codins, String nomins, String refins, String undIns, BigDecimal undxEmp, String codLinea, String codSub, Character clase, Boolean garantia, Integer qtyDiasGar, Boolean activo, String fichaTec, BigDecimal ucoins, String codrap, BigDecimal ultimoPrecio, String codbar, boolean consumoPeriodico, boolean permitirFraccion, String nitPro, String codAnt, String codIva, boolean modificado, String codCueIvaGen, String codCueIvaDes, String codCueAdivaGen, String codCueAdivaDes, String mlcodterp, String mlcodclase, String mlcodprod, String mlcodtipo, String codCueIngresos, String codCueAdingresos, String codCueCostos, String codCueAdcostos, String codCueInventario, String codCueAdinventario, String tmpnomline, String tmpnomsub, String numimp, String descrip, boolean controlbascula, boolean plangim, int plangimqtydias, boolean plangimxsesion, int plangimqtysesion, String codmar, String idcum, BigDecimal boxAlto, BigDecimal boxLargo, BigDecimal boxAncho, String ubiFisica, String codUsuDescontinua, Date fechaDescontinua, BigDecimal boxPeso, BigDecimal margenHipo, BigDecimal margenIco, String codIvaCxP, BigDecimal margenIcocxP, BigDecimal margenIcoven, String codgrut, boolean descargueSel, String eanins, boolean reqSerialInFac, int qtySerial, boolean infoExtendida) {
       this.codins = codins;
       this.nomins = nomins;
       this.refins = refins;
       this.undIns = undIns;
       this.undxEmp = undxEmp;
       this.codLinea = codLinea;
       this.codSub = codSub;
       this.clase = clase;
       this.garantia = garantia;
       this.qtyDiasGar = qtyDiasGar;
       this.activo = activo;
       this.fichaTec = fichaTec;
       this.ucoins = ucoins;
       this.codrap = codrap;
       this.ultimoPrecio = ultimoPrecio;
       this.codbar = codbar;
       this.consumoPeriodico = consumoPeriodico;
       this.permitirFraccion = permitirFraccion;
       this.nitPro = nitPro;
       this.codAnt = codAnt;
       this.codIva = codIva;
       this.modificado = modificado;
       this.codCueIvaGen = codCueIvaGen;
       this.codCueIvaDes = codCueIvaDes;
       this.codCueAdivaGen = codCueAdivaGen;
       this.codCueAdivaDes = codCueAdivaDes;
       this.mlcodterp = mlcodterp;
       this.mlcodclase = mlcodclase;
       this.mlcodprod = mlcodprod;
       this.mlcodtipo = mlcodtipo;
       this.codCueIngresos = codCueIngresos;
       this.codCueAdingresos = codCueAdingresos;
       this.codCueCostos = codCueCostos;
       this.codCueAdcostos = codCueAdcostos;
       this.codCueInventario = codCueInventario;
       this.codCueAdinventario = codCueAdinventario;
       this.tmpnomline = tmpnomline;
       this.tmpnomsub = tmpnomsub;
       this.numimp = numimp;
       this.descrip = descrip;
       this.controlbascula = controlbascula;
       this.plangim = plangim;
       this.plangimqtydias = plangimqtydias;
       this.plangimxsesion = plangimxsesion;
       this.plangimqtysesion = plangimqtysesion;
       this.codmar = codmar;
       this.idcum = idcum;
       this.boxAlto = boxAlto;
       this.boxLargo = boxLargo;
       this.boxAncho = boxAncho;
       this.ubiFisica = ubiFisica;
       this.codUsuDescontinua = codUsuDescontinua;
       this.fechaDescontinua = fechaDescontinua;
       this.boxPeso = boxPeso;
       this.margenHipo = margenHipo;
       this.margenIco = margenIco;
       this.codIvaCxP = codIvaCxP;
       this.margenIcocxP = margenIcocxP;
       this.margenIcoven = margenIcoven;
       this.codgrut = codgrut;
       this.descargueSel = descargueSel;
       this.eanins = eanins;
       this.reqSerialInFac = reqSerialInFac;
       this.qtySerial = qtySerial;
       this.infoExtendida = infoExtendida;
    }
   
    public String getCodins() {
        return this.codins;
    }
    
    public void setCodins(String codins) {
        this.codins = codins;
    }
    public String getNomins() {
        return this.nomins;
    }
    
    public void setNomins(String nomins) {
        this.nomins = nomins;
    }
    public String getRefins() {
        return this.refins;
    }
    
    public void setRefins(String refins) {
        this.refins = refins;
    }
    public String getUndIns() {
        return this.undIns;
    }
    
    public void setUndIns(String undIns) {
        this.undIns = undIns;
    }
    public BigDecimal getUndxEmp() {
        return this.undxEmp;
    }
    
    public void setUndxEmp(BigDecimal undxEmp) {
        this.undxEmp = undxEmp;
    }
    public String getCodLinea() {
        return this.codLinea;
    }
    
    public void setCodLinea(String codLinea) {
        this.codLinea = codLinea;
    }
    public String getCodSub() {
        return this.codSub;
    }
    
    public void setCodSub(String codSub) {
        this.codSub = codSub;
    }
    public Character getClase() {
        return this.clase;
    }
    
    public void setClase(Character clase) {
        this.clase = clase;
    }
    public Boolean getGarantia() {
        return this.garantia;
    }
    
    public void setGarantia(Boolean garantia) {
        this.garantia = garantia;
    }
    public Integer getQtyDiasGar() {
        return this.qtyDiasGar;
    }
    
    public void setQtyDiasGar(Integer qtyDiasGar) {
        this.qtyDiasGar = qtyDiasGar;
    }
    public Boolean getActivo() {
        return this.activo;
    }
    
    public void setActivo(Boolean activo) {
        this.activo = activo;
    }
    public String getFichaTec() {
        return this.fichaTec;
    }
    
    public void setFichaTec(String fichaTec) {
        this.fichaTec = fichaTec;
    }
    public BigDecimal getUcoins() {
        return this.ucoins;
    }
    
    public void setUcoins(BigDecimal ucoins) {
        this.ucoins = ucoins;
    }
    public String getCodrap() {
        return this.codrap;
    }
    
    public void setCodrap(String codrap) {
        this.codrap = codrap;
    }
    public BigDecimal getUltimoPrecio() {
        return this.ultimoPrecio;
    }
    
    public void setUltimoPrecio(BigDecimal ultimoPrecio) {
        this.ultimoPrecio = ultimoPrecio;
    }
    public String getCodbar() {
        return this.codbar;
    }
    
    public void setCodbar(String codbar) {
        this.codbar = codbar;
    }
    public boolean isConsumoPeriodico() {
        return this.consumoPeriodico;
    }
    
    public void setConsumoPeriodico(boolean consumoPeriodico) {
        this.consumoPeriodico = consumoPeriodico;
    }
    public boolean isPermitirFraccion() {
        return this.permitirFraccion;
    }
    
    public void setPermitirFraccion(boolean permitirFraccion) {
        this.permitirFraccion = permitirFraccion;
    }
    public String getNitPro() {
        return this.nitPro;
    }
    
    public void setNitPro(String nitPro) {
        this.nitPro = nitPro;
    }
    public String getCodAnt() {
        return this.codAnt;
    }
    
    public void setCodAnt(String codAnt) {
        this.codAnt = codAnt;
    }
    public String getCodIva() {
        return this.codIva;
    }
    
    public void setCodIva(String codIva) {
        this.codIva = codIva;
    }
    public boolean isModificado() {
        return this.modificado;
    }
    
    public void setModificado(boolean modificado) {
        this.modificado = modificado;
    }
    public String getCodCueIvaGen() {
        return this.codCueIvaGen;
    }
    
    public void setCodCueIvaGen(String codCueIvaGen) {
        this.codCueIvaGen = codCueIvaGen;
    }
    public String getCodCueIvaDes() {
        return this.codCueIvaDes;
    }
    
    public void setCodCueIvaDes(String codCueIvaDes) {
        this.codCueIvaDes = codCueIvaDes;
    }
    public String getCodCueAdivaGen() {
        return this.codCueAdivaGen;
    }
    
    public void setCodCueAdivaGen(String codCueAdivaGen) {
        this.codCueAdivaGen = codCueAdivaGen;
    }
    public String getCodCueAdivaDes() {
        return this.codCueAdivaDes;
    }
    
    public void setCodCueAdivaDes(String codCueAdivaDes) {
        this.codCueAdivaDes = codCueAdivaDes;
    }
    public String getMlcodterp() {
        return this.mlcodterp;
    }
    
    public void setMlcodterp(String mlcodterp) {
        this.mlcodterp = mlcodterp;
    }
    public String getMlcodclase() {
        return this.mlcodclase;
    }
    
    public void setMlcodclase(String mlcodclase) {
        this.mlcodclase = mlcodclase;
    }
    public String getMlcodprod() {
        return this.mlcodprod;
    }
    
    public void setMlcodprod(String mlcodprod) {
        this.mlcodprod = mlcodprod;
    }
    public String getMlcodtipo() {
        return this.mlcodtipo;
    }
    
    public void setMlcodtipo(String mlcodtipo) {
        this.mlcodtipo = mlcodtipo;
    }
    public String getCodCueIngresos() {
        return this.codCueIngresos;
    }
    
    public void setCodCueIngresos(String codCueIngresos) {
        this.codCueIngresos = codCueIngresos;
    }
    public String getCodCueAdingresos() {
        return this.codCueAdingresos;
    }
    
    public void setCodCueAdingresos(String codCueAdingresos) {
        this.codCueAdingresos = codCueAdingresos;
    }
    public String getCodCueCostos() {
        return this.codCueCostos;
    }
    
    public void setCodCueCostos(String codCueCostos) {
        this.codCueCostos = codCueCostos;
    }
    public String getCodCueAdcostos() {
        return this.codCueAdcostos;
    }
    
    public void setCodCueAdcostos(String codCueAdcostos) {
        this.codCueAdcostos = codCueAdcostos;
    }
    public String getCodCueInventario() {
        return this.codCueInventario;
    }
    
    public void setCodCueInventario(String codCueInventario) {
        this.codCueInventario = codCueInventario;
    }
    public String getCodCueAdinventario() {
        return this.codCueAdinventario;
    }
    
    public void setCodCueAdinventario(String codCueAdinventario) {
        this.codCueAdinventario = codCueAdinventario;
    }
    public String getTmpnomline() {
        return this.tmpnomline;
    }
    
    public void setTmpnomline(String tmpnomline) {
        this.tmpnomline = tmpnomline;
    }
    public String getTmpnomsub() {
        return this.tmpnomsub;
    }
    
    public void setTmpnomsub(String tmpnomsub) {
        this.tmpnomsub = tmpnomsub;
    }
    public String getNumimp() {
        return this.numimp;
    }
    
    public void setNumimp(String numimp) {
        this.numimp = numimp;
    }
    public String getDescrip() {
        return this.descrip;
    }
    
    public void setDescrip(String descrip) {
        this.descrip = descrip;
    }
    public boolean isControlbascula() {
        return this.controlbascula;
    }
    
    public void setControlbascula(boolean controlbascula) {
        this.controlbascula = controlbascula;
    }
    public boolean isPlangim() {
        return this.plangim;
    }
    
    public void setPlangim(boolean plangim) {
        this.plangim = plangim;
    }
    public int getPlangimqtydias() {
        return this.plangimqtydias;
    }
    
    public void setPlangimqtydias(int plangimqtydias) {
        this.plangimqtydias = plangimqtydias;
    }
    public boolean isPlangimxsesion() {
        return this.plangimxsesion;
    }
    
    public void setPlangimxsesion(boolean plangimxsesion) {
        this.plangimxsesion = plangimxsesion;
    }
    public int getPlangimqtysesion() {
        return this.plangimqtysesion;
    }
    
    public void setPlangimqtysesion(int plangimqtysesion) {
        this.plangimqtysesion = plangimqtysesion;
    }
    public String getCodmar() {
        return this.codmar;
    }
    
    public void setCodmar(String codmar) {
        this.codmar = codmar;
    }
    public String getIdcum() {
        return this.idcum;
    }
    
    public void setIdcum(String idcum) {
        this.idcum = idcum;
    }
    public BigDecimal getBoxAlto() {
        return this.boxAlto;
    }
    
    public void setBoxAlto(BigDecimal boxAlto) {
        this.boxAlto = boxAlto;
    }
    public BigDecimal getBoxLargo() {
        return this.boxLargo;
    }
    
    public void setBoxLargo(BigDecimal boxLargo) {
        this.boxLargo = boxLargo;
    }
    public BigDecimal getBoxAncho() {
        return this.boxAncho;
    }
    
    public void setBoxAncho(BigDecimal boxAncho) {
        this.boxAncho = boxAncho;
    }
    public String getUbiFisica() {
        return this.ubiFisica;
    }
    
    public void setUbiFisica(String ubiFisica) {
        this.ubiFisica = ubiFisica;
    }
    public String getCodUsuDescontinua() {
        return this.codUsuDescontinua;
    }
    
    public void setCodUsuDescontinua(String codUsuDescontinua) {
        this.codUsuDescontinua = codUsuDescontinua;
    }
    public Date getFechaDescontinua() {
        return this.fechaDescontinua;
    }
    
    public void setFechaDescontinua(Date fechaDescontinua) {
        this.fechaDescontinua = fechaDescontinua;
    }
    public BigDecimal getBoxPeso() {
        return this.boxPeso;
    }
    
    public void setBoxPeso(BigDecimal boxPeso) {
        this.boxPeso = boxPeso;
    }
    public BigDecimal getMargenHipo() {
        return this.margenHipo;
    }
    
    public void setMargenHipo(BigDecimal margenHipo) {
        this.margenHipo = margenHipo;
    }
    public BigDecimal getMargenIco() {
        return this.margenIco;
    }
    
    public void setMargenIco(BigDecimal margenIco) {
        this.margenIco = margenIco;
    }
    public String getCodIvaCxP() {
        return this.codIvaCxP;
    }
    
    public void setCodIvaCxP(String codIvaCxP) {
        this.codIvaCxP = codIvaCxP;
    }
    public BigDecimal getMargenIcocxP() {
        return this.margenIcocxP;
    }
    
    public void setMargenIcocxP(BigDecimal margenIcocxP) {
        this.margenIcocxP = margenIcocxP;
    }
    public BigDecimal getMargenIcoven() {
        return this.margenIcoven;
    }
    
    public void setMargenIcoven(BigDecimal margenIcoven) {
        this.margenIcoven = margenIcoven;
    }
    public String getCodgrut() {
        return this.codgrut;
    }
    
    public void setCodgrut(String codgrut) {
        this.codgrut = codgrut;
    }
    public boolean isDescargueSel() {
        return this.descargueSel;
    }
    
    public void setDescargueSel(boolean descargueSel) {
        this.descargueSel = descargueSel;
    }
    public String getEanins() {
        return this.eanins;
    }
    
    public void setEanins(String eanins) {
        this.eanins = eanins;
    }
    public boolean isReqSerialInFac() {
        return this.reqSerialInFac;
    }
    
    public void setReqSerialInFac(boolean reqSerialInFac) {
        this.reqSerialInFac = reqSerialInFac;
    }
    public int getQtySerial() {
        return this.qtySerial;
    }
    
    public void setQtySerial(int qtySerial) {
        this.qtySerial = qtySerial;
    }
    public boolean isInfoExtendida() {
        return this.infoExtendida;
    }
    
    public void setInfoExtendida(boolean infoExtendida) {
        this.infoExtendida = infoExtendida;
    }




}


