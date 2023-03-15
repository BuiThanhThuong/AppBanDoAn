package com.example3t.appbandoan.ketnoi;



import com.example3t.appbandoan.model.Donhangmd;
import com.example3t.appbandoan.model.LoaiSpModel;
import com.example3t.appbandoan.model.MessageModel;
import com.example3t.appbandoan.model.mathangmd;
import com.example3t.appbandoan.model.usermd;

import io.reactivex.rxjava3.core.Observable;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface cuahang {
    @GET("themsanpham.php")
    Observable<mathangmd> getThemsanpham();
    @GET("getloaisp.php")
    Observable<LoaiSpModel> getLoaiSp();
    @POST("user.php")
    @FormUrlEncoded
    Observable<usermd>user(
            @Field("SDT") String SDT,
            @Field("matkhau") String matkhau,
            @Field("tenuser") String tenuser,
            @Field("gmail") String gmail
    );
    @POST("dangnhap.php")
    @FormUrlEncoded
    Observable<usermd>dangnhap(
            @Field("SDT") String SDT,
            @Field("matkhau") String matkhau

    );


    @POST("timkiem.php")
    @FormUrlEncoded
    Observable<mathangmd> seach(
            @Field("seach") String seach
    );


    @POST("updatezalo.php")
    @FormUrlEncoded
    Observable<MessageModel> updatezalo(
            @Field("madonhang") Integer madonhang,
            @Field("token") String token

    );
    @POST("donhang.php")
    @FormUrlEncoded
    Observable<MessageModel>donhang(
                    @Field("sdt") String sdt,
                    @Field("email") String email,
                    @Field("tongtien") String tongtien,
                    @Field("iduser") Integer iduser,
                    @Field("tenuser") String tenuser,
                    @Field("diachi") String diachi,
                    @Field("soluong") Integer soluong,
                    @Field("chitiet") String chitiet
                   //  @Field("token") String token
    );
    @POST("donhang1.php")
    @FormUrlEncoded
    Observable<MessageModel>donhang1(
            @Field("sdt") String sdt,
            @Field("email") String email,
            @Field("tongtien") String tongtien,
            @Field("iduser") Integer iduser,
            @Field("tenuser") String tenuser,
            @Field("diachi") String diachi,
            @Field("soluong") Integer soluong,
            @Field("chitiet") String chitiet
            //  @Field("token") String token
    );
    @POST("xemdonhang.php")
    @FormUrlEncoded
    Observable<Donhangmd> xemdonhang(
            @Field("iduser") int iduser
    );
    @POST("chitietloai.php")
    @FormUrlEncoded
    Observable<mathangmd> chitietloai(
            @Field("IDSP") int IDSP
    );
    @POST("ctmonchinh.php")
    @FormUrlEncoded
    Observable<mathangmd> ctmonchinh(
            @Field("IDSP") int IDSP
    );
    @POST("ctmonnuoc.php")
    @FormUrlEncoded
    Observable<mathangmd> ctmonnuoc(
            @Field("IDSP") int IDSP
    );
    @POST("ctdouong.php")
    @FormUrlEncoded
    Observable<mathangmd> ctdouong(
            @Field("IDSP") int IDSP
    );
    @POST("dsnew.php")
    Observable<mathangmd> dsnew(
            @Field("mamathang") int mamathang
    );
}
