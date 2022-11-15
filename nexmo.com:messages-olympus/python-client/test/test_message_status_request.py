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

from openapi_client.models.message_status_request import MessageStatusRequest

class TestMessageStatusRequest(unittest.TestCase):
    """MessageStatusRequest unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> MessageStatusRequest:
        """Test MessageStatusRequest
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `MessageStatusRequest`
        """
        model = MessageStatusRequest()
        if include_optional:
            return MessageStatusRequest(
                client_ref = '',
                error = openapi_client.models.message_status_base_error.messageStatusBase_error(
                    detail = 'Throttled - You have exceeded the submission capacity allowed on this account. Please wait and retry', 
                    instance = 'bf0ca0bf927b3b52e3cb03217e1a1ddf', 
                    title = '1000', 
                    type = 'https://developer.nexmo.com/api-errors/messages-olympus#1000', ),
                var_from = '447700900001',
                message_uuid = 'aaaaaaaa-bbbb-cccc-dddd-0123456789ab',
                status = 'read',
                timestamp = '2020-01-01T14:00:00.000Z',
                to = '447700900000',
                usage = openapi_client.models.message_status_base_usage.messageStatusBase_usage(
                    currency = 'EUR', 
                    price = '0.0333', ),
                channel = 'viber_service',
                whatsapp = openapi_client.models.whats_app_1_whatsapp.WhatsApp_1_whatsapp(
                    conversation = openapi_client.models.whats_app_1_whatsapp_conversation.WhatsApp_1_whatsapp_conversation(
                        id = '1234567890', 
                        origin = openapi_client.models.whats_app_1_whatsapp_conversation_origin.WhatsApp_1_whatsapp_conversation_origin(
                            type = 'user_initiated', ), ), )
            )
        else:
            return MessageStatusRequest(
                var_from = '447700900001',
                message_uuid = 'aaaaaaaa-bbbb-cccc-dddd-0123456789ab',
                status = 'read',
                timestamp = '2020-01-01T14:00:00.000Z',
                to = '447700900000',
                channel = 'viber_service',
        )
        """

    def testMessageStatusRequest(self):
        """Test MessageStatusRequest"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
