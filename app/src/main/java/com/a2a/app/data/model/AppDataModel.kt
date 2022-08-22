package com.a2a.app.data.model


import com.google.gson.annotations.SerializedName

data class AppDataModel(
    val message: String,
    val result: Result,
    val status: String // success
) {
    data class Result(
        @SerializedName("about_us")
        val aboutUs: String, // Charabuni Services Pvt. Ltd. is a registered pvt. ltd. company registered in ROC, Kolkata with registered address at 811 Qube Near City Center II Rajarhat Kolkata – 700156Tastes2Plate is a jobitel.com Registered (TM) Aggregator Platform under Charabuni Services Pvt Ltd which aggregrates User and Sellers in one place using Tastes2Plate Platform. It aggregrates products which are divided in seven categories 1. Sweets 2. Spices 3. Cooked Food 4. Grains 5. Fresh Fruits 6. Bakery 7. FlowersTastes2plate provides a facility to the registered vendors to display their products on Website with the rate of each products & available Quantity of the Product. User can book the products either using the Website or using the Mobile AppThird party Logistic partners with an agreement with Charabuni Services Pvt Ltd will be responsible to pick-up the Product/s and deliver it to the usersCANCELLATION & RETURN POLICY – For booking of the products; there will be a cut-off time for the user to book for the delivery of the product/s in stipulated timeline. Any products puchased before the Cut-over time can be cancelled & full return will be credisted in user’s registered bank accountCancellation is not possible after the Cut-Off time & there will be no-return of the payment to the user
        val address: String, // 811 PS QUBE NEAR CITY CENTER II NEW TOWN RAJARHAT KOLKAT 700156
        @SerializedName("app_settings")
        val appSettings: AppSettings,
        @SerializedName("cancel_time")
        val cancelTime: String, // 4
        @SerializedName("contact_email")
        val contactEmail: String, // support@tastes2plate.com
        @SerializedName("contact_phone")
        val contactPhone: String, //  18008434001 (10:00 AM to 7:00 PM) - Our service is on HOLD due to irregular flights
        @SerializedName("customer_android_version")
        val customerAndroidVersion: String, // 1.2.3
        @SerializedName("customer_ios_version")
        val customerIosVersion: String, // 10.4
        val dashboard: List<Dashboard>,
        @SerializedName("logistic_android_version")
        val logisticAndroidVersion: String, // 1.0.42
        @SerializedName("logistic_ios_version")
        val logisticIosVersion: String, // 1.0.31
        @SerializedName("maximum_order_value_cod")
        val maximumOrderValueCod: String, // 1500
        @SerializedName("minimum_order_value")
        val minimumOrderValue: String, // 550
        val point: Point,
        val privacy: String, // At tastes2plate Web / Mobile app Delivery, We use the personal information which you provide to us when using our service, including but not limited to our website. Please read this Privacy Policy and understand it before using our iskenderun escort. By visiting and/or ordering iskenderun escort on this Website, you agree and, where required, consent to the collection, use and transfer of your information as set out in this policy.What information we collect about you?We collect personal information from you when you order goods or iskenderun escort from us or use our Website. We also collect information when you complete any customer survey. Website usage information may also be izmir escort using cookies (as defined below). tastes2plate Web / Delivery will collect information that personally identifies you and/or your location, where required (this may include your name, email address, home address, telephone number, geolocation, etc.), but only when you voluntarily give it to us.Cookies and Google AnalyticsSome of the information izmir escort will not personally identify you but will instead track your use of the Website so that we can better understand how the Website is used by customers and in turn enhance and improve your experience in ordering food. We may obtain this information by use of cookies. Cookies are a small data file transferred to your device that recognises and identifies your device and allows your device to ‘remember’ information from the Website for future use. Cookies do not contain any information that personally identifies you and we do not use cookies in order to obtain such information – your personal information can only be obtained by Food  / Goods Web Delivery if you actively provide it to us.This website uses Google Analytics, a web analytics service provided by Google, Inc. (“Google”). Google Analytics uses “cookies”, which are text files saved on your computer, to help the website analyze how you use the site. The information generated by the cookie about your use of the website will be transmitted to and stored by Google on servers in the United States. If this website anonymizes IP addresses, your IP address will be truncated by Google within a EU member state or other EEA state before being transmitted to the US. Only in exceptional situations will your full IP address be transmitted to Google servers in the United States and truncated there. Google will use this information for the purpose of evaluating your use of the website, compiling reports on website activity for website operators and providing other iskenderun escort relating to website activity and internet usage. Google will not associate your IP address with any other data held by Google. You may refuse the use of cookies by selecting the appropriate settings on your browser, however please note that if you do this you may not be able to use the full functionality of this website. By using this website, you consent to the processing of data about you by Google in the manner and for the purposes set out above. You can also prevent Google from collecting information (including your IP address) via cookies and processing this information by downloading this browser plugin and installing it: https://tools.google.com/dlpage/gaoptoutHow will we use the information we collect from you?You consent to Charabuni Services Pvt Ltd collecting and using your personal information for processing and delivering the order/s placed on the Website and any other service provided through the Website. In particular you expressly consent that Charabuni Services Pvt Ltd may disclose your personal information, including your name, email address, physical address and telephone number to riders delivering your order, either employed by Charabuni Services Pvt Ltd or by third parties providing delivery iskenderun escort to Charabuni Services Pvt Ltd. You consent to Charabuni Services Pvt Ltd using your personal information for advertising and direct marketing purposes in order to inform you about the Website and the goods and iskenderun escort it provides, or other matters that it believes will be of interest to you.Access to your informationYou have a right to request a copy of the information we hold on you at any time. Please email us if you would like to receive a copy of this information – support@tastes2plate.com.Other WebsitesOur website may have links to other websites. This privacy policy only applies to this website. You should therefore read the privacy policies of the other websites when you are using those sites.
        val terms: String, // Please read the terms and conditions below carefully before ordering goods from this website / mobile app. By ordering goods you agree to be bound by these terms and conditions.Section 1: Introduction, Tastes2plate is a Delivery Aggregator Platform under Charabuni Services Pvt Ltd & the website is https://taste2plate.com/ , mobile app at Google Play store and Apple App Store in the name of Tastes2plate (T2P)Section 2: Definitions2.1. The agreement is a reference to these terms and conditions, the privacy policy, any order form and payment instructions that will be provided to you2.2. Privacy Policy means the policy posted on our website that details how we collect and store your personal information.2.3. Goods delivery is provided by Tastes2Plate Delivery and our partner ottlets provide goods2.4. “Outlets Partner” is a third party that has agreed to cooperate with the Company to prepare the GoodsSection 3: Order3.1. For the supply of goods from this website or using the Mobile App, all contact is between you and Tastes2plate Delivery Platform. You agree to be especially vigilant when providing us with your details and guarantee that this information is accurate and complete at the time of ordering.3.2. The goods purchased on this website or using Mobile App are for your own use only and you warrant that the goods purchased by you are not intended for resale and that you act as the principal and not as the agent of another party at any time receiving.3.3. Please note that some of our merchandise may be suitable for certain age groups only. You must verify that the product you order is suitable for the intended recipient.3.4. When ordering from this site, you may need to provide an e-mail address and a password. You must ensure that the combination of this information is secure and do not provide this information to a third party.3.5. We will take all reasonable precautions, to the extent that it is in our power, to keep the details of your order and payment secure, but in the absence of negligence on our part, we can not be held liable for any loss that you could suffer if a third party gets unauthorized access to the data you provide when accessing or ordering from the website or using Mobile App3.6. Any order you place with us is subject to the availability of the product, the delivery capacity and acceptance by us and the participating outlet. When you place your order online, we will send you an e-mail to confirm that we have received it. This confirmation email will be generated automatically so that you have confirmation of the details of your order. You must inform us immediately if details are incorrect. The fact that you receive an automatic confirmation does not necessarily mean that we or the participating outlet will be able to fulfill your order. Once we have sent the confirmation email, we will check the availability and delivery capacity.3.7. If the ordered delivery and delivery capacity is available, Tastes2plate Delivery and the participating Outlet will accept the contract and confirm it to the customer. If the details of the order are correct, the contract for the delivery of food, goods or iskenderun escort will be confirmed by SMS.3.8. The confirmation message will indicate the delivery details, including the approximate delivery time specified by Tastes2plate Delivery and confirm the price of delivery of the food, goods and iskenderun escort ordered.3.9. If the delivery of food and / or goods is not available or if there is no delivery capacity, we will also inform you by SMS or phone call.Section 4: Price and Payment4.1. Any contract for the delivery of food or any products from this website or using the Mobile app, is between you and Tastes2plate Delivery; You agree to be especially vigilant when providing us with your details and guarantee that this information is accurate and complete at the time of ordering.4.2. All prices listed on the website orin the Mobile app are correct at the time of publication and have been entered as received by the Outlet; Although we take great care to keep them up to date, the final price charged to you by the Outlet may change at the time of delivery depending on the last menu and prices of the Outlet. We also reserve the right to modify the goods available for sale on the website and to stop the registration of Outlet, products etc..4.3. All prices listed on the website for food / goods delivery by the participating Outlets reflect the price that the participating Outlrt charges at the time of registration. In case the price indicated is not up to date and the Outlet will inform us immediately after the order, we will do our best to contact you to inform you of the price difference and you can choose to unsubscribe from the order at the moment.4.4. All prices for tastes2plate delivery or a third party vendor assigned by the tastes2plate food / goods delivery listed on the website are correct at the time of publication, however, we reserve the right to modify them in the future.4.5. The total price of food / goods delivery, goods or iskenderun escort ordered, including shipping and other charges, will be posted on the website / Mobile app when you place your order. Full payment must be made for all goods / goods at the time of placing the Order using the On-Line finiancial Transaction Services using the Payment Gateway Plaform in our Website or Mobile App4.6. The prices listed on the website / e-mail are determined solely by the participating Outlets and informed at tastes2plate food / goods delivery at the time of registration or after. Any changes to the menu prices at the time of the order are at the sole discretion of the participating Outlet.4.7. All applicable taxes and levies, the rates of these and the manner of application of these taxes are charged and determined by the participating Outlet and the taste2plate food delivery is simply collect on behalf of that participating Outlet.4.8. The total amount of applicable taxes by the Tastes2plate food / Goods delivery is directly remitted as it is to the participating Outlet and the Taste2plate food / Goods delivery keeps no amount4.9. Outlet food / goods delivery, tastes2plate Food / Goods Delivery is not responsible for validating the legality of the applicable taxes and how they are applicable on behalf of the Participating Outlet. Regarding the delivery of food / goods, tastes2plate Food / goods Delivery is not responsible for the legal accuracy / validity of the collection of these taxes. Exclusive responsibility for all legal matters regarding taxes rests with the participating restaurant.4.10. The prices listed on the website / Mobile app are determined solely by the participating restaurant and communicated at the time of registration. Any changes to the menu prices at the time of the order are at the sole discretion of the participating outlet.4.11. The food or goods sale transaction is between tastes2plate Food / Goods Delivery and the customer, and therefore, the tastes2plate food / goods delivery is not responsible for billing or depositing applicable taxes on that transaction.4.12. The final tax invoice will be issued by the participating Outlet and delivered to the customer with the order.Section 5: Delivery5.1. Delivery times indicated at the time of order are approximate and may vary. The goods will be delivered to the address you indicated at the time of the order.5.2. If delivery is made by the participating Outlet, it is the sole responsibility of participating Outlet to provide timely food / Goods delivery.5.3. In case the delivery is made by Tastes2plate food / goods delivery, we will take care to deliver in a timely manner. No responsibility is taken for late delivery by Tastes2plate food / goods delivery in either case.5.4. All orders are delivered by a reputable courier. We and the participating outlets will make every effort to deliver within the specified time, however, we will not be liable for any loss caused to you by late ordering. If the goods are not delivered within the delivery times estimated by us, please first contact the participating Outlet. You can also contact us by phone or e-mail and we will try to send you your order as soon as possible.5.5. In case of late delivery, shipping costs will not be canceled or refunded by tastes2plate Food / Goods Delivery.5.6. If you do not accept the delivery of food and / or goods at the time they are ready for delivery, or if we are unable to deliver at the time indicated due to your failure to provide the appropriate instructions or authorizations , these goods will be deemed to have been delivered to you and all risks and liability with respect to these products will be passed on to you. Any storage, insurance and other costs we incur due to the inability to deliver will be at your expense and you will have to fully indemnify us for this cost.5.8. You must ensure that at the time of delivery of food and / or merchandise, adequate arrangements, including access if necessary, are in place for the safe delivery of these goods. We will not be liable for any damages, costs or expenses incurred for these goods or premises if this occurs due to lack of adequate access or delivery arrangements.5.9. Tastes2plate Food / Goods Delivery will aim to5.9.1. you deliver the product to the place of delivery requested by you in your order;5.9.2. delivered within the confirmed time;5.9.3. Inform you if they expect to be unable to meet the estimated delivery time.5.10. Participating Outlets and we will not be liable to you for any loss, liability, costs, damages, charges or expenses arising from late delivery;5.11. Please note that tastes2plate Food / Goods Delivery may not be able to deliver in certain locations. If we will inform you using the contact information you have given us when placing your order and will arrange the cancellation of the order or delivery to another delivery address;Section 6: Cancellation6.1. Cancelation is possible within four hours of the order placed or before the cut off time, whichever will be earlier. You must immediately notify tastes2plate Food Delivery if you decide to cancel your order, preferably by phone, and indicate your order number. If the Outlet accepts your cancellation, no cancellation fee applies. If the Outletrefuses cancellation, eg. because the preparation of the food delivery has been completed and / or the delivery staff has already been sent, it can not be canceled. We will not be able to refund any orders that have already been shipped. 6.2. We may cancel a contract if the product is unavailable for any reason. We will inform you if this is the case and you will return any payment you have made;6.3. If the cancellation was made on time and once the restaurant has accepted your cancellation, we will refund you which includes the initial delivery charge (if any) that you paid for the delivery of the goods or iskenderun escort, if applicable.6.4. In the unlikely event that tastes2plate Food / Goods Delivery delivers a wrong item, you have the right to refuse the delivery of the wrong item and you will be fully refunded for the missing item. If tastes2plate Food / Goods Delivery can only partially deliver (some items may not be available), its staff should inform you or propose a replacement for missing items. You have the right to refuse a partial order before delivery and get a refund. We are not responsible for the wrong or partial delivery. The problem must be resolved directly with the participating Outlets.Section 7: ComplaintsWe like every customer to check the quality of food delivered at the time of delivery and confirm about the quality of food items delivered. We not entertain any complain after tge delivery is done and accepted by customer.  We take complaints very seriously and strive to respond to your complaints within 5 business days. All complaints should be addressed to support@tastes2plate.comSection 8: Limitation of Liability8.1. Great care has been taken to ensure that the information available on this site is correct and error-free. We apologize for any errors or omissions that may have occurred. We can not guarantee that the use of the Site will be error free or adapted to the use, in a timely manner, that the defects will be corrected, or that the site or the server that makes it available are free of viruses or bugs or website and we make no warranty, express or implied, as to fitness for purpose or accuracy.8.2. By accepting these terms of use, you agree to release us from any liability arising from your use of any third party’s information, or your use of a third party’s website, or your consumption of food or beverages from any third party. participating Outlets.8.3. We do not assume any liability to you for the supply of food, goods and iskenderun escort to the fullest extent permitted by applicable law. This does not affect your statutory rights as a consumer. If we are held liable for loss or damage, this liability is limited to the amount you paid for the goods or iskenderun escort in question. We cannot accept any liability for any loss, damage or expense, including any direct or indirect loss such as loss of profits, regardless of the cause. This limitation of liability does not apply to personal injury or death resulting directly from our negligence.8.4. We accept no responsibility for any delay, failure, error or omission or loss of information transmitted, viruses or other contamination or destructive property transmitted to you or your computer system via our website / mobile app.8.5. We will not be liable for any failure or delay in the performance of the Services or delivery of the Goods where such failure occurs as a result of an act or omission beyond our reasonable control, such as all events crushing and inevitable caused directly and exclusively by forces of a nature that cannot be anticipated, controlled or prevented by the exercise of prudence, diligence and care, including but not limited to: war, riot, civil unrest; compliance with any law or governmental order, rule, regulation or directive and acts of third parties.8.6. If we are committed to providing the same or similar order to more than one Customer and are prevented from fully complying with our obligations due to Force Majeure, we may decide in our sole discretion what orders we will make fill in and to what extent.8.7. We have taken all reasonable steps to prevent and ensure that you are safe and secure. However, we may not be held liable in the event of a breach of the law or a breach of the law.Section 9: General9.1. All prices are in INR (Indian Rupee).9.2. We may alter or vary the terms and conditions.9.3. Payment must be made at the time of placing the order using the online payment facility in our website or mobile app. Failure to pay will result in the cancellation of your order.9.4. Do not use or launch any automated system or link to our website or its online ordering functionality;9.5. The Terms and Conditions together with the Privacy Policy, any order form and payment instructions constitute the entire agreement between you and us. No other terms of the agreement or part of this Agreement. In the event of any conflict between these terms and conditions, the terms and conditions shall prevail.9.6. If any term or condition of such agreement shall be deemed to be invalid, or otherwise, the term shall be deemed to be such that it shall be deemed to be deleted and the remainder of the Agreement shall continue to be in force.
        @SerializedName("vendor_android_version")
        val vendorAndroidVersion: String, // 1.0
        @SerializedName("vendor_ios_version")
        val vendorIosVersion: String, // 3.0
        val whatsapp: String // Service is on HOLD due to Irregular / Last minutes cancellation of Flights
    ) {
        data class AppSettings(
            val cancel: Cancel,
            val cod: Cod,
            @SerializedName("delivery_popup")
            val deliveryPopup: DeliveryPopup,
            val express: Express,
            @SerializedName("header_bg_color")
            val headerBgColor: String, // #ddc108
            val order: Order,
            val popup: Popup,
            val slider: Slider
        ) {
            data class Cancel(
                @SerializedName("cancel_popup_bg_color")
                val cancelPopupBgColor: String, // #fafafa
                @SerializedName("cancel_popup_desctiption")
                val cancelPopupDesctiption: String, // Order can be cancelled within FOUR hours of the order placed or before "Cut Off", time whichever is earlier.
                @SerializedName("cancel_popup_subtitle")
                val cancelPopupSubtitle: String, // 'Order Cancellation'
                @SerializedName("cancel_popup_title")
                val cancelPopupTitle: String, // "CANCEL"
                @SerializedName("cancel_popup_title_color")
                val cancelPopupTitleColor: String, // #ff0000
                @SerializedName("cancel_subtitle_desctiption_color")
                val cancelSubtitleDesctiptionColor: String, // #ff0000
                @SerializedName("cancel_subtitle_title_color")
                val cancelSubtitleTitleColor: String // #fc0303
            )

            data class Cod(
                @SerializedName("cod_popup_bg_color")
                val codPopupBgColor: String, // #ffffff
                @SerializedName("cod_popup_desctiption")
                val codPopupDesctiption: String, // 'PLEASE PAY DIGITALLY USING T2P QR CODE OR THE LINK AT THE TIME OF DELIVERY'
                @SerializedName("cod_popup_subtitle")
                val codPopupSubtitle: String, // 'DIGITAL PAYMENT IN COD'
                @SerializedName("cod_popup_title")
                val codPopupTitle: String, // COD PAYMENT
                @SerializedName("cod_popup_title_color")
                val codPopupTitleColor: String, // #302c2c
                @SerializedName("cod_subtitle_desctiption_color")
                val codSubtitleDesctiptionColor: String, // #655858
                @SerializedName("cod_subtitle_title_color")
                val codSubtitleTitleColor: String // #564d4d
            )

            data class DeliveryPopup(
                @SerializedName("delivery_popup_bg_color")
                val deliveryPopupBgColor: String, // #d00b0b
                @SerializedName("delivery_popup_desctiption")
                val deliveryPopupDesctiption: String,
                @SerializedName("delivery_popup_subtitle")
                val deliveryPopupSubtitle: String,
                @SerializedName("delivery_popup_title")
                val deliveryPopupTitle: String,
                @SerializedName("delivery_popup_title_color")
                val deliveryPopupTitleColor: String, // #c0b4b4
                @SerializedName("delivery_subtitle_desctiption_color")
                val deliverySubtitleDesctiptionColor: String, // #d04949
                @SerializedName("delivery_subtitle_title_color")
                val deliverySubtitleTitleColor: String // #654bc3
            )

            data class Express(
                @SerializedName("express_popup_bg_color")
                val expressPopupBgColor: String, // #fc0303
                @SerializedName("express_popup_desctiption")
                val expressPopupDesctiption: String, // Additional Express shipping cost applied.
                @SerializedName("express_popup_subtitle")
                val expressPopupSubtitle: String, // 'EXPRESS SHIPPING'
                @SerializedName("express_popup_title")
                val expressPopupTitle: String, // Express
                @SerializedName("express_popup_title_color")
                val expressPopupTitleColor: String, // #171616
                @SerializedName("express_subtitle_desctiption_color")
                val expressSubtitleDesctiptionColor: String, // #fcfcfc
                @SerializedName("express_subtitle_title_color")
                val expressSubtitleTitleColor: String // #141414
            )

            data class Order(
                @SerializedName("order_track_popup_bg_color")
                val orderTrackPopupBgColor: String, // #0ae6d7
                @SerializedName("order_track_popup_desctiption")
                val orderTrackPopupDesctiption: String, // Tracking will Start once ORDER STATUS will change to 'OUT FOR DELIVERY'
                @SerializedName("order_track_popup_subtitle")
                val orderTrackPopupSubtitle: String, // 'ORDER TRACKING'
                @SerializedName("order_track_popup_title")
                val orderTrackPopupTitle: String, // TRACK
                @SerializedName("order_track_popup_title_color")
                val orderTrackPopupTitleColor: String, // #0f0f0f
                @SerializedName("order_track_subtitle_desctiption_color")
                val orderTrackSubtitleDesctiptionColor: String, // #03044f
                @SerializedName("order_track_subtitle_title_color")
                val orderTrackSubtitleTitleColor: String // #fa0505
            )

            data class Popup(
                @SerializedName("popup_bg_color")
                val popupBgColor: String, // #fc0303
                @SerializedName("popup_subtitle")
                val popupSubtitle: String, // 'Thanks for supporting us'
                @SerializedName("popup_title")
                val popupTitle: String, // 'SORRY'
                @SerializedName("popup_title_color")
                val popupTitleColor: String,
                @SerializedName("subtitle_desctiption_color")
                val subtitleDesctiptionColor: String, // #fafafa
                @SerializedName("subtitle_title_color")
                val subtitleTitleColor: String
            )

            data class Slider(
                @SerializedName("service_popup_bg_color")
                val servicePopupBgColor: String, // #fb0909
                @SerializedName("service_popup_desctiption")
                val servicePopupDesctiption: String, // IN ONE ORDER, PLEASE SELECT FOOD ITEM'S FROM ONE CITY ONLY
                @SerializedName("service_popup_subtitle")
                val servicePopupSubtitle: String, // 'Thanks for supporting us'
                @SerializedName("service_popup_title")
                val servicePopupTitle: String, // 'SORRY'
                @SerializedName("service_popup_title_color")
                val servicePopupTitleColor: String, // #0d0d0d
                @SerializedName("service_subtitle_desctiption_color")
                val serviceSubtitleDesctiptionColor: String, // #fdfcfc
                @SerializedName("service_subtitle_title_color")
                val serviceSubtitleTitleColor: String // #141414
            )
        }

        data class Dashboard(
            @SerializedName("background_image")
            val backgroundImage: String, // https://t2p.fra1.digitaloceanspaces.com/16316334065128pyrc.jpeg
            val icon: String, // https://t2p.fra1.digitaloceanspaces.com/1630914846329lsldt.png
            val title: String
        )

        data class Point(
            @SerializedName("cod_digital_payment")
            val codDigitalPayment: String, // 0
            @SerializedName("point_value_in_rupee")
            val pointValueInRupee: String, // 1.0
            val review: String, // 0
            val settings1: Settings1,
            val settings2: Settings2,
            val settings3: Settings3,
            @SerializedName("signup_bonus_reciver")
            val signupBonusReciver: String, // 0
            @SerializedName("signup_bonus_sender")
            val signupBonusSender: String // 0
        ) {
            data class Settings1(
                @SerializedName("max_order")
                val maxOrder: String, // 0
                @SerializedName("min_order")
                val minOrder: String, // 0
                val point: String // 0
            )

            data class Settings2(
                @SerializedName("max_order")
                val maxOrder: String, // 0
                @SerializedName("min_order")
                val minOrder: String, // 0
                val point: String // 0
            )

            data class Settings3(
                @SerializedName("max_order")
                val maxOrder: String, // 0
                @SerializedName("min_order")
                val minOrder: String, // 0
                val point: String // 0
            )
        }
    }
}