# coding: utf-8

"""
    Messages API

    The Messages API consolidates and normalises exchanges across all messaging channels. It allows you to use a single API to interact with our various channels such as SMS, MMS, WhatsApp, Viber and Facebook Messenger

    The version of the OpenAPI document: 1.4.0
    Contact: devrel@nexmo.com
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.whats_app import WhatsApp

class TestWhatsApp(unittest.TestCase):
    """WhatsApp unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> WhatsApp:
        """Test WhatsApp
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `WhatsApp`
        """
        model = WhatsApp()
        if include_optional:
            return WhatsApp(
                client_ref = '',
                message_type = 'custom',
                text = None,
                channel = 'whatsapp',
                var_from = '447700900001',
                to = '447700900000',
                location = openapi_client.models.location_1_location.Location_1_location(
                    address = '23 Main St, Holmdel, NJ 07733, USA', 
                    lat = 40.34772, 
                    long = -74.18847, 
                    name = 'Vonage', ),
                image = openapi_client.models.whats_app_one_of_2_all_of_image.WhatsApp_oneOf_2_allOf_image(
                    caption = 'Additional text to accompany the image.', 
                    url = 'https://example.com/image.jpg', ),
                audio = openapi_client.models.whats_app_one_of_3_all_of_audio.WhatsApp_oneOf_3_allOf_audio(
                    url = null, ),
                video = openapi_client.models.whats_app_one_of_4_all_of_video.WhatsApp_oneOf_4_allOf_video(
                    caption = 'Additional text.', 
                    url = null, ),
                file = openapi_client.models.whats_app_one_of_5_all_of_file.WhatsApp_oneOf_5_allOf_file(
                    caption = 'Additional text.', 
                    url = null, ),
                template = openapi_client.models.template_1_template.Template_1_template(
                    name = '9b6b4fcb_da19_4a26_8fe8_78074a91b584:verify', 
                    parameters = ["Verification","2526","5"], ),
                whatsapp = openapi_client.models.whats_app_one_of_6_all_of_whatsapp.WhatsApp_oneOf_6_allOf_whatsapp(
                    locale = 'en_US', 
                    policy = 'deterministic', ),
                custom = { }
            )
        else:
            return WhatsApp(
                message_type = 'custom',
                text = None,
                channel = 'whatsapp',
                var_from = '447700900001',
                to = '447700900000',
                location = openapi_client.models.location_1_location.Location_1_location(
                    address = '23 Main St, Holmdel, NJ 07733, USA', 
                    lat = 40.34772, 
                    long = -74.18847, 
                    name = 'Vonage', ),
                image = openapi_client.models.whats_app_one_of_2_all_of_image.WhatsApp_oneOf_2_allOf_image(
                    caption = 'Additional text to accompany the image.', 
                    url = 'https://example.com/image.jpg', ),
                audio = openapi_client.models.whats_app_one_of_3_all_of_audio.WhatsApp_oneOf_3_allOf_audio(
                    url = null, ),
                video = openapi_client.models.whats_app_one_of_4_all_of_video.WhatsApp_oneOf_4_allOf_video(
                    caption = 'Additional text.', 
                    url = null, ),
                file = openapi_client.models.whats_app_one_of_5_all_of_file.WhatsApp_oneOf_5_allOf_file(
                    caption = 'Additional text.', 
                    url = null, ),
                template = openapi_client.models.template_1_template.Template_1_template(
                    name = '9b6b4fcb_da19_4a26_8fe8_78074a91b584:verify', 
                    parameters = ["Verification","2526","5"], ),
                whatsapp = openapi_client.models.whats_app_one_of_6_all_of_whatsapp.WhatsApp_oneOf_6_allOf_whatsapp(
                    locale = 'en_US', 
                    policy = 'deterministic', ),
        )
        """

    def testWhatsApp(self):
        """Test WhatsApp"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
