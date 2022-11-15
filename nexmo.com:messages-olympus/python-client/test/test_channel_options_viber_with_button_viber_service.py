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

from openapi_client.models.channel_options_viber_with_button_viber_service import ChannelOptionsViberWithButtonViberService

class TestChannelOptionsViberWithButtonViberService(unittest.TestCase):
    """ChannelOptionsViberWithButtonViberService unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> ChannelOptionsViberWithButtonViberService:
        """Test ChannelOptionsViberWithButtonViberService
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `ChannelOptionsViberWithButtonViberService`
        """
        model = ChannelOptionsViberWithButtonViberService()
        if include_optional:
            return ChannelOptionsViberWithButtonViberService(
                action = openapi_client.models.channel_options_viber_with_button_viber_service_action.channelOptionsViberWithButton_viber_service_action(
                    text = 'Find out more', 
                    url = 'https://example.com/page1.html', ),
                category = 'transaction',
                ttl = 600,
                type = ''
            )
        else:
            return ChannelOptionsViberWithButtonViberService(
        )
        """

    def testChannelOptionsViberWithButtonViberService(self):
        """Test ChannelOptionsViberWithButtonViberService"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
