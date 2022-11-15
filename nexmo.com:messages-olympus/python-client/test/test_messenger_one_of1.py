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

from openapi_client.models.messenger_one_of1 import MessengerOneOf1

class TestMessengerOneOf1(unittest.TestCase):
    """MessengerOneOf1 unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> MessengerOneOf1:
        """Test MessengerOneOf1
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `MessengerOneOf1`
        """
        model = MessengerOneOf1()
        if include_optional:
            return MessengerOneOf1(
                client_ref = '',
                image = openapi_client.models.messenger_one_of_1_all_of_image.Messenger_oneOf_1_allOf_image(
                    url = 'https://example.com/image.jpg', ),
                message_type = 'image',
                channel = 'messenger',
                var_from = '9876543210',
                messenger = openapi_client.models.channel_options_messenger_messenger.channelOptionsMessenger_messenger(
                    category = 'response', 
                    tag = 'CONFIRMED_EVENT_UPDATE', ),
                to = '0123456789'
            )
        else:
            return MessengerOneOf1(
                image = openapi_client.models.messenger_one_of_1_all_of_image.Messenger_oneOf_1_allOf_image(
                    url = 'https://example.com/image.jpg', ),
                message_type = 'image',
                channel = 'messenger',
                var_from = '9876543210',
                to = '0123456789',
        )
        """

    def testMessengerOneOf1(self):
        """Test MessengerOneOf1"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
