package com.example.assignment1imad5112

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnSearch = findViewById<Button>(R.id.btnSearch)
        val btnClear = findViewById<Button>(R.id.btnClear)
        val edtAge = findViewById<EditText>(R.id.edtAge)
        val ageResult = findViewById<TextView>(R.id.ageResult)

        btnClear.setOnClickListener{

            ageResult.text=""
            edtAge.text.clear()

        }


        btnSearch.setOnClickListener {
            val ageText = edtAge.text.toString()


            if (ageText.isEmpty()) {
                ageResult.text = "Please enter an age in number form"
            } else {

                val iAge = ageText.toIntOrNull()
                if (iAge == null) {
                    ageResult.text = "Please enter an age only eg.78"
                } else {

                    val ageInfoMap = mapOf(
                        36 to "Princess Diana (01/07/1961 - 31/08/1997): According to wikipedia(2024) 'Diana, Princess of Wales' and the first wife to Charles III. A British royalty and philanthropist known for her humanitarian work, advocacy for charitable causes such as AIDS awareness and landmine eradication, and her impact on modernizing the British monarchy through her charitable efforts and public image.",
                        37 to "Marie Antoinette (02/11/1755 - 16/10/1793): Queen of France and was married at the age of 14 to King Louis XVI, known for her extravagant lifestyle and association with the decline of the French monarchy (see Marie Antoinette Biography- Rise Above Life,2023). Famously associated with the phrase, According to Britannica 2024 'Let them eat cake.'",
                        42 to "Elvis Presley (08/01/1935 - 16/08/1977): American singer, musician, and actor known as the 'King of Rock and Roll', who revolutionized popular music with his charisma, unique voice, and iconic performances (see Elvis Presley: Life and Death of the King- Biographics,2020).",
                        56 to "Steve Jobs (24/02/1955 - 05/10/2011): American entrepreneur, with Steve Wozniak founded Apple Inc. in 1976 (Britannica, 2024). He was a visionary leader in the development of personal computers, smartphones, and digital entertainment, known for his innovation and design aesthetics.",
                        65 to "Walt Disney (05/12/1901 - 15/12/1996): American entrepreneur, animator, and film producer who created iconic characters such as Mickey Mouse in 1928 (Wikipedia,2024). He also founded The Walt Disney Company, revolutionizing the entertainment industry with animated films and theme parks.",
                        69 to "Marco Polo (15/09/1254 - 08/01/1324): Venetian explorer and merchant whose travels to Asia introduced Europeans to Central Asia and China, documenting his experiences in the book 'The Travels of Marco Polo'(see Marco Polo: The World’s Greatest Explore-Biographics,2019).",
                        76 to "Stephen Hawking (08/01/1942 - 14/03/2018): British theoretical physicist known for his work on black holes, cosmology, and the nature of the universe, despite living with Amyotrophic lateral sclerosis (ALS), author of 'A Brief History of Time'(Wikipedia,2024).",
                        78 to "Mahatma Gandhi (02/10/1869 - 30/01/1948): Indian lawyer, anti-colonial nationalist, and spiritual leader who employed nonviolent resistance to lead India to independence from British ruling, advocating for civil rights and social justice (History-biography).",
                        84 to "Isaac Newton (04/01/1643 - 31/03/1727): English mathematician, physicist, and astronomer who formulated the laws of motion and universal gravitation, laying the foundation for classical mechanics and modern physics (Wikipedia,2024).",
                        87 to "Mother Teresa (26/08/1910 - 05/09/1997): Albanian-Indian Roman Catholic nun and missionary known for her humanitarian work among the poor and sick people in India, founder of the Missionaries of Charity and Nobel Peace Prize recipient.(Biography of Mother Teresa | History | Lifestyle | Pope Francis- BIOGRAPH,2019).",
                        88 to "Michelangelo (06/03/1475 - 18/02/1564): Italian Renaissance artist known for his sculptures such as 'David' and 'Pieta'(Wikipedia,2024)., as well as his paintings in the Sistine Chapel, regarded as one of the greatest artists of all time.",
                        90 to "Desmond Tutu (07/10/1931 - 26/12/2021): South African Anglican bishop and social rights activist known for his role in the anti-apartheid movement, promoting reconciliation and human rights in post-apartheid South Africa, Nobel Peace Prize recipient(Wikipedia, 2024).",
                        95 to "Stan Lee (28/12/1922 - 12/11/2018): American comic book writer, editor, and publisher known for co-creating iconic superheroes such as Spider-Man, Iron Man, and the X-Men, revolutionizing the comic book industry and pop culture (Wikipedia,2024).",
                        96 to "Queen Elizabeth II (21/04/1926 - 08/09/2022): Queen of the United Kingdom and other Commonwealth realms since 1952, making her the longest-reigning monarch in British history, known for her dedication to public service and modernization of the monarchy (Wikipedia,2024).",
                        99 to "Prince Philip (10/06/1921 - 09/04/2021): Duke of Edinburgh, husband of Queen Elizabeth II, and British royal known for his decades of public service, including his role as patron or president of numerous organizations, his support for environmental and technological initiatives, and his contributions to international diplomacy and cultural exchange programs (Wikipedia, 2024)."
                    )

                    val person = ageInfoMap[iAge]
                    if (person != null) {
                        ageResult.text = "$person passed away at the age of $iAge"
                    } else if (iAge in 1..19) {
                        ageResult.text = "No record found of this age. Please enetr a age between 20 and 100"
                    } else {
                        ageResult.text = "No information found for age $iAge"
                    }
                }
            }
        }
    }
}