NodeColour Enumerasi:
Pertama-tama, program ini menggunakan enumerasi NodeColour untuk mewakili status atau warna yang digunakan dalam algoritma BFS. Enumerasi ini merupakan bagian dari pendekatan representasi yang lebih formal dalam algoritma grafik. Algoritma BFS memerlukan pemantauan status node selama proses eksplorasi, dan enumerasi ini digunakan untuk menandai status node dengan warna yang bermakna: WHITE (putih), GRAY (abu-abu), dan BLACK (hitam).

Node Class:
Kemudian, program ini mendefinisikan kelas Node, yang berperan dalam merepresentasikan setiap node dalam grafik. Dalam konteks akademis, setiap node dianggap sebagai entitas yang memiliki atribut yang signifikan. Atribut data digunakan untuk menyimpan informasi atau nomor yang terkait dengan node tersebut. Dalam analisis grafik, atribut ini bisa menggambarkan konten atau label yang ada pada node. Selain itu, terdapat atribut distance yang mengindikasikan jarak (dalam BFS) dari node ini ke node awal. Jarak ini akan berubah selama proses BFS saat mencari jalur terpendek. Selain itu, terdapat atribut predecessor yang menunjukkan node mana yang menjadi pendahulu dalam jalur terpendek ke node saat ini. Atribut colour menunjukkan status warna node selama proses BFS, yang berguna untuk mengidentifikasi node yang telah dieksplorasi.

AdjacencyList Class:
Kelas AdjacencyList adalah kelas utama yang digunakan untuk mengelola grafik dalam bentuk adjacency list. Ini adalah salah satu cara yang umum digunakan dalam teori grafik untuk merepresentasikan hubungan antara node dalam grafik. Grafik ini diwakili sebagai kumpulan node yang memiliki daftar node tetangga yang berdekatan. Dalam analisis akademis, adjacency list merupakan representasi yang efisien untuk menggambarkan struktur hubungan antar-node dalam grafik.

Kelas ini memiliki beberapa metode yang memfasilitasi proses BFS:

Metode addEdge(Node n1, Node n2) digunakan untuk menambahkan tepian (edge) yang menghubungkan dua node. Ini merupakan konsep dasar dalam representasi grafik. Penambahan tepian ini memperbarui adjacency list sehingga node n2 menjadi tetangga dari node n1.
Metode bfs(Node s) adalah inti dari algoritma BFS. Algoritma BFS digunakan untuk mencari jalur terpendek dari node awal (s) ke semua node lain dalam grafik. Dalam analisis akademis, BFS adalah algoritma pencarian yang memiliki sifat ekploratif yang mendasari untuk menemukan jalur terpendek dan memberikan solusi dalam berbagai konteks, termasuk jaringan komputer, grafik sosial, dan penelitian operasi.
Metode Main:
Dalam metode main, program ini mengeksekusi algoritma BFS pada grafik yang telah didefinisikan. Konfigurasi grafik, node-node, dan hubungan antar-node didefinisikan di sini. Proses ini menggambarkan penggunaan algoritma BFS dalam konteks nyata, di mana BFS digunakan untuk mencari jalur terpendek dalam struktur grafik yang telah dibangun.

Hasil akhir dari program ini adalah pencetakan jalur terpendek dan jarak dari node awal ke semua node lain dalam grafik. Hasil ini disajikan dalam bentuk output yang mencakup atribut-atribut node, termasuk nomor node (data), jarak (distance), dan warna (colour), yang mencerminkan status mereka selama proses BFS.
