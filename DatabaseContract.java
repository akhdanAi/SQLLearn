package com.example.dbtest;

import android.provider.BaseColumns;

public final class DatabaseContract {
    private DatabaseContract() {}

    public static class TbMahasiswa implements BaseColumns {
        public static final String TABLE_NAME = "mahasiswa";
        public static final String COLUMN_NAME_NAMA = "nama";
        public static final String COLUMN_NAME_EMAIL = "email";
        public static final String COLUMN_NAME_ID_DOSENPA = "id_dosenpa";
        public static final String COLUMN_NAME_ID_JURUSAN = "id_jurusan";
    }
    public static class TbDosen implements BaseColumns {
        public static final String TABLE_NAME = "dosen";
        public static final String COLUMN_NAME_NAMA = "nama";
        public static final String COLUMN_NAME_EMAIL = "email";
    }
    public static class TbJurusan implements BaseColumns {
        public static final String TABLE_NAME = "Jurusan";
        public static final String COLUMN_NAME_NAMA_JURUSAN = "nama_jurusan";
    }
}
