## database Data Produk

## Untuk menjalankan aplikasi
1. jalankan MySQL Server.
2. Tampilkan Menu.showMenu() dari kelas Menu dan Jalankan di kelas "App.java" untuk menjalankan aplikasi
3. Di kelas menu terdapat beberapa opsi
    a. Opsi 1 : membaca data produk dari database.
    b. Opsi 2 : menambahkan data produk baru ke database.
    c. Opsi 3 : mengubah data produk yang teredia di database.
    d. Opsi 4 : delete data dari database.
    e. Opsi 0 : untuk keluar dari aplikasi.

## Struktur Proyek
Folder "com.config" berisi "DbConnect" mengatur koneksi ke database.
Folder "com.controller" berisi "DbController" untuk sebagai pengontrol data produk di database.
Folder "com.layout" berisi bermacam kelas untuk mengatur tampilan beberapa data.
Folder "com.models" berisi kelas "Produk" untuk mewakili model data produk.

## com.layout
1. Menu : untuk menu utama aplikasi menampilkan Metode show.menu() digunakan untuk menampilkan beberapa opsi menu.
2. ReadData : membaca dan menampilkan produk dari database kepada pengguna.
3. InsertData : untuk menambahksn data produk baru ke database.
4. EditData : mengubah jumlah produk yang tersedia di database.
5. DeleteData : Menghapus data produk daeri database.