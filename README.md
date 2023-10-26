# ESSAI - Artificial Intelligence (Muhammad Adityo Wiryawan 5311421077)

                                      SVM ALGORITHM: SIMPLE FACE RECOGNITION FOR UNLOCK FILE 


Artificial Intelligence atau kecerdasan buatan merupakan ilmu yang mempelajari bagaimana komputer memiliki kecerdasan, baik itu dapat berpikir atau berperilaku menyerupai manusia secara rasional. Jadi kata kuncinya itu ada 3, “berpikir”, “berperilaku”, dan “secara rasional”. 

Artificial intelligence memiliki ruang lingkup yaitu searching, reasoning, planning, dan learning. Saat ini lingkup yang sedang hype adalah learning atau machine learning. Pada machine learning dibagi menjadi supervised dan unsupervised learning. 

Salah satu algoritma yang ada pada machine learning yang termasuk supervised learning adalah SVM. SVM merupakan singkatan dari "Support Vector Machine," yang merupakan salah satu algoritma klasifikasi dan regresi dalam pembelajaran mesin. SVM adalah metode yang digunakan untuk memisahkan dua kelas data dengan mencari "hyperplane" optimal yang memaksimalkan margin antara dua kelas tersebut.

SVM dapat digunakan untuk melakukan klasifikasi gambar. SVM bekerja dengan memisahkan gambar dan mencari hyperplane yang paling Optimal. Salah satu penggunaan sederhananya adalah dengan mengintegrasikan SVM pada face recognition. Face recognition tersebut terhubung ke program yang mengunci suatu file. Apabila wajah yang dideteksi cocok dengan gambar wajah yang ditraining, maka file yang terkunci akan terbuka. 

Dalam pengklasifikasian gambar, SVM bekerja dengan mengidentifikasi batas pemisahan antara berbagai objek atau kategori yang mungkin ada dalam gambar. Proses dimulai dengan mengumpulkan data pelatihan yang terdiri dari gambar yang sudah diberi label, di mana setiap gambar diketahui tergolong ke dalam kategori tertentu.. Setiap gambar pelatihan akan diubah menjadi representasi vektor fitur yang mencerminkan karakteristik gambar tersebut. SVM kemudian mencoba untuk menemukan hyperplane (bidang linier) yang memisahkan vektor fitur dari berbagai kategori atau kelas. Jika data gambar tidak dapat dipisahkan secara linier, SVM dapat menggunakan kernel seperti kernel linier, kernel polinomial, atau kernel radial basis function (RBF) untuk memetakan data ke dimensi yang lebih tinggi, di mana pemisahan linier menjadi mungkin. Setelah proses pelatihan selesai, model SVM dapat digunakan untuk mengklasifikasikan gambar baru dengan mengubahnya menjadi vektor fitur dan memeriksa pada sisi mana dari hyperplane hasil pelatihan gambar tersebut terletak, sehingga mengklasifikasikannya ke dalam salah satu kategori yang sudah dikenali.

Sebagai face recognition, SVM dapat diintegerasikan dengan mikrokontroler untuk dapat bekerja secara wireless. Namun, mikrokontroler seperti ESP32 memiliki keterbatasan resource sehingga membutuhkan server eksternal yang terhubung secara wireless dengan mikrokontroler tersebut.

Keunggulan SVM dalam pengklasifikasian gambar adalah kemampuannya untuk menangani kasus yang kompleks dan data yang tidak linier, serta efektivitasnya dalam mengatasi overfitting. Hal ini menjadikan SVM berguna dalam pengenalan objek dalam gambar, klasifikasi gambar medis, pengenalan karakter tulisan tangan, dan aplikasi lain yang melibatkan analisis visual. Pemilihan kernel dan penyetelan parameter yang sesuai sangat penting dalam mengoptimalkan performa SVM dalam pengklasifikasian gambar.

