package com.fast.odc_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.bumptech.glide.Glide
import com.fast.odc_2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)


        Glide.with(binding.root.context)
            .load("https://lh3.googleusercontent.com/u/0/drive-viewer/AK7aPaBP9kJbYcnAz73S3A9HzING3oBSLMl3NS5TLhrCLhr0WNuqCTFBzpegjAkvf6fHkTwEWiFLGyEAZwo8w5am_KyMuQhV=w1053-h872")
            .into(binding.imgTwitterBlackBackgroundGlide)

        Glide.with(binding.root.context)
            .load("https://lh3.googleusercontent.com/fife/AK0iWDyn9Hq6o4iIwBA2TahmM33SSzHEqrqVFTdksJUu-g36ZV3MTXvSbkpnGYEj3WYOUB3TirMAeBMh3wHpqZJ1OpDbeq4kFcWbS-5WOeuBLr6yE75NkDiuI3x3UwaWluUtsn5EouLGlOL42og8KvVrBY9hBexTyqCJLsdDcsCuBR6EaCZTZp5iF9o2w2xhT0w8wsmDKcT0s76pdx24dQaVZ9k5QtkGSvuXCdcUmlRHniTJIjSyc6nEHx3_Gyx-oHjtH-YR7uFer64n7JNkgA-3e9FcoWVL_trkj1xF1dKKLm_yNhc0zSt86JzrEnYCg2etvJPN8YwJFT3ZlyAuQvlXcjANZo-RjZGulZe8qhDp0uiCo_56cuX4GbiQGG-gTDJXja3IUNgU3h2BB7kQ8Z-tew9veG8OJ1qRcbbiN5PxaxyruwRqIxou2V2NJxYhBzbq7Ci7EqFWz2IahTNavDdqNVbNNzt6gYlWBQSWP1TXYJVzLv95NIJuu6_7AFOQfwTsQ34e8vP-mOrxdCBSMc5OtsRRIhyAKSissw-QQz7RacCnzT1nIplmUyxDoar5wU8fejmd0BBtF_DEV-L4xRUZS2QsrTebj8OtH0OMfr7fW3OpSU19VW4ppU4FAlL_2_v_cpAUJ-i01twa3zbP4Gf-RZ6SJWACNn4yIe2zp10n6Kb0IL-ikE3mQeU4P8JDaHIy2hb6VpffMXRLkvSA_M_CMu3iRYmPS28TyTAM4zRTyifiOgpZCbZpg_XHLCePSCQIZj27SG7Yx-_nMwm33ql7g6maNjMnNtu4V8m29zJ4oWR7ex46qcdaPYQ4xgOnsgopngAzyGCDRYNF_Nd6Rsk8AOlahLCoxpqARXRhjqTaMT-UouQRYYtysphXaEeN2VOeEyl3nPZ3kM7uRqZKM-aHh2r69nQKJrEPPzcwRdXCfqZ9obVSIPMQfyf5jwLOJsIia_wIm-A6RqpNrzRRSmVdcksNTFSI0ApUGtE30TgRjhCGiAyc3aiSe_MUfmbsynJ4KeSHEG67O8HKDHmcroB0NBWTDGpRRm1HaBA7lDpXukcd0UdJkoL0WBXFW4MFUUU3rlVKaZqGfPJiAW6gbcjI58Y30JD_DIRF10XetMyTdgyc7-gB0qFP7TMswc-A5S7uG_MENsnhGBfOYtPeNuvDJyb1mD4e4lf_WlbXqvTgUmRsWD8AQRQSvx-wOmANczjFQ6XsUcB73ZthCKutPcWDAQNeJHIUfJNzs2-3WPPCtDnKLXfFXEqoVVgsDrj9wUvhDLbEPSfOTHcO5RHshO1sHn8PyoHfx80BKKl0npTi6_kdubHI6VKgEgeQWjTRwcKnI7X5EW1uNKpLnQuFn79Xp7kmGcRwaLJOdNONvR1Ld-M7pLTqli-V38nr-NVhiV1gK3azXOSLgYCIHO4zBooNhVt8EQF1sWfgQvLTrG85f2usMkFevl4BoWTll64Aun2J0WtU8nOm0gvbdxjy26m1QkXTj1W4sGiRWHLdy_NocIFAlb-HsqLpUiO9JK1Ez6HKuM_qaK_ZFSYKPyhM-XPUX4siWSD7S064aTWtgWo2BvMd0nhli-U=w1053-h892")
            .into(binding.imgTwitterWhiteBackgroundGlide)

        Glide.with(binding.root.context)
            .load("https://lh3.googleusercontent.com/fife/AK0iWDy0UNLWyMmZLHCe9x-dC7bbksX5hh4k5XGgG4_4l2Y-s3MmKhRr_2J0wOz4ebDxiZTj5hU2mR0ZYVM7FVubyegYghFTtQ9dALGtnFF7IX1rmsTDCl-dspU5rOHhkG34vyaaOCJTGwxIlkDObn1xTHOUQnhDj6kBMIbTQrzfZ5ccfP0ZHYd3vCr0EgIFgxU13enguj6d2N_f35LANsOfoS7BSl7Ur8DVTTMzlnqv77exetdEZ-5k610UdzC9y9xb8oTwh8or0L1PrTW8p24YIoW1183j8svx7RwannPaAvYCpaHzzM20mTThItCSwF9inZCrzL45lyz9YCiCuBzDez-KNHUmPvV491dZGSs2lRWckDFanVmDV_DX3lIoiLfhSnctNqsQdPSyYooMaDowvVgCbaZUdoID9IlFLnfKLtffLhME5rKp8cuYf4dUg_CtCrEgiN_m7GB0K_vaDdY8mPqqPfVo5GEUITxwe_49_2EBrDoxXfMKpz4H14yCOmZForqSK_T96Z1gjXZY6aLUIYUST5-E1yQPST25-FriiTWcjQm0vsZoa9u3O44E45uw5M1b3ebXoVtW9mDtSYfojn7ctAM_FvNmB43AUw-Lz-AVNw9xoCAzuLDkSwOmwI_PZSXY-tCqCbK_8AZu8qfughQlh3huYoYSYVpGSiJcBQMcbh_zbNNDURIZWF1a5_0bOFrkMDU9M357wr7Bo3WAvq-jA7iXIBlxrF8sZHIIzzgxBvtxe2OWyToVI84YeKsZELaOzipcpyZnmfLBdmUozROQVyPLTLNLmOuHKiRx5BBizU-fJ49Otl0T8idIv2dE2qFrsI-5gyY7rni6cR1D9kkgxTpOb7GXdICYler8l_Jx3ohkvTkKXlpkMptwz0rnMxTrYK3SJ00FfLM44BHvtcLnHZjPua5FiQlGj8FllJLaZbOKgo68aKs0hl5e2BIeUI9u7_SqiFyqFmYprTFtUreCJT9zx9ROqhAXOlhiG3zbWkN5lsKvf_SzbuxgdacnJMxmRglTGVMIjTPUyY2ZDHc3p9rPCE8dDhdLEhmtd_UReFvYSKAUpqSl0vtyPmJCTKpEyE2yvdTnxWLmoxDLQx6uAOMLGaxnstJc9yccc1PgVP7Z3y69uoWBcEBwBRI0am-ddBtDtPN1fUVrHwHzc0XrjiQJd_EwCK9qr5CgDAJbOluNHNeW5fs8MKBKLKRolH4Mp1c4fDBfDyjqCHmYY9CtPMM_A8ZUpreXObOLDE89gs7gXzS7tNKOqIdTHD8z_ZQ5j8b7NdbEO5rQPLY9jMd3gRO3AIEPTUDHpzhUvMV80VO0yDZeDR24IYD9b9PS3sfho76GLVvTrzWmF-__THCI083DYMuzwSKyjdP4qQ_qiUmcBrxobSGzc3HFrUAlQ6pOjp_NfSvxpUOoJ9H-DonzKLoihhF4mVXmE7j_PO7FzlNNy9mwU3bnQMFlkC69ULzH3iyHrX0_qSgIkxRadlJRdrRs3D4fpjwFmeAetLUWLXjsa9oOIiD1qS_PZEEkWd2svSGCNK-jEJtq1dz2ygIKzs-NebpUq1Pftk1W3CxFCgJJCRc=w1053-h892")
            .into(binding.imgZommedTwitterBlackBackgroundGlide)

        Glide.with(binding.root.context)
            .load("https://lh3.googleusercontent.com/fife/AK0iWDxOesmOvy4Jfhj_BwlFOg-NJu_Fip_-yqjZ79ySwSf5O0DtoLrNmk5hrU3S_wYNrqsMhcMunOOMug6Xhktwhg2yQI8oIkUG_XoRKyN2pXCuvt7qY2X0ZGFpX1TQsZ0FYjXxw3scaS9G7LwUqP1ycyGvBeLRw5AeXVV7q_GSCQ0J750OKzk4jllf6k99hfsQLFmRLCM-iNDy5sd_AzS0CB6Gu6iwX6Ll9O5SNTZF79eo5od2OEHhBIp3PDqYnUjSchNWzSaqcUJR2rlC_VMpaF_0FblRUTvQ_YGssuf8jBUf8d-xFPLNVwdY39mrFO1E0HNFdlcvd83_8nCq-h5ZK-NffWt9lbBah7bKEMcog461Afca3VWxKgbMfgJoLsJqB0TpREoVIgCpfhTreCbYHARu3RVZkb0721_6BHD6MbtXDXCt86dvGE0yyZhRM-8IBa37LMsO6_GqH9BCoJQUKpLkMYD8wPGpTmIEdP1JzWm5bNljhfyBO9zGk-qXZyyies1b45Pa5rjns6K-DA2QffsK-A8O-OVGYbvTM3Lo-W03tv4PPDsL27rt23MUGCV8Xnfl2MRFcVcJvaGpq_-66jvfAdUqkvo5ffS0l4nUNHms4Ry9Id_4x9-o8xuM_SeXSaHshVt0cZtOVkfi3gyKLujYLWqQe0UIQmdYNu5WoisKMEMD9qZPwe0Np8FN4nSkaHBI-XGONzWY5dmkAmWUxbpoe_5O8fUIdEiVZB4cM59xotIh6x-b20VyzFmGoXHgUOLkAIlZf_Jjdj7NbyW-eqGARofbE2aGJ1Te_mnVXwbPl9CvGOOk2kXUw4kNPlfpJAeWQ3KfN9owg22WGgaFuThEgWAFiEHO-r-WLiybz35Tl9M5K55UoYQwGETojdTvm71clzSwWR_PeeA9jxh_z4EqdGRElsNM7E41o18qwz5ZFWeMNIXukmgYcvpvsyqfZ6HJleYdliNRkAMl0m5hobv8MW6hjartECH7WB9hqHtvaXqEeg-5DTrSuiM2wL8Hqla52OpUpeXlnaRAgTCoPr1uKC4mDBUG9oZgxs5vjV6wQ8iKIvXaoV9ZnOL--74y-EqUO7_Mn0I7TwbhnYiuAGMNoNNjQ-fdhCw8B1PX8IHtLhhzuH98fgNbAlFAW0J4vtYJ9nLCSsPUOyG5qmUuYPPl-yIEpCDuTRHbPqry81TS50IdfDfzYCUxenki04-b47X6xkMKpGGwAJpBLBcQu1ghP9vmI5Q3TtrXlWISnZWutTs-bGy0GopHFGTT1xTPkEITnEcQcHj0yhl4grKE7L_3SxuXDgXaNIHWSfOkJnBt4tE_lHnludGkBqRu7KEPM_yMLeOOtYbKnq6KriLDIov0K3C3eG9GaPA-hGOWehEXdSVwDzXsUaiW6XsfDvpjjFG_q-y28-n3GfQrHEV1ZA-2GWUQ8E2EYZf_UsCqIhZhqd9i6lSqYPiyCYIMNsgbBd1eoFgP3RieBndeeeWEo8sYNSWF9MB_nsUaL0sgP_AmiVLDYQ5U5_ZjdMJlvfsT6c-laTOXPpgSqhtSGIzPvNxCzpsHYW3H4T1p3kKWAALjLd01pOE=w1053-h892")
            .into(binding.imgZommedTwitterWhiteBackgroundGlide)


    }
}