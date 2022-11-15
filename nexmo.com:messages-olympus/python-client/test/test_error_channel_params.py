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

from openapi_client.models.error_channel_params import ErrorChannelParams

class TestErrorChannelParams(unittest.TestCase):
    """ErrorChannelParams unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> ErrorChannelParams:
        """Test ErrorChannelParams
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `ErrorChannelParams`
        """
        model = ErrorChannelParams()
        if include_optional:
            return ErrorChannelParams(
                detail = 'The value of one or more parameters is invalid.',
                instance = 'bf0ca0bf927b3b52e3cb03217e1a1ddf',
                invalid_parameters = [
                    openapi_client.models.error_channel_params_invalid_parameters_inner.ErrorChannelParams_invalid_parameters_inner(
                        name = 'messenger.category', 
                        reason = 'Must be one of `response`, `update` or `message_tag`.', )
                    ],
                title = 'Invalid channel parameters',
                type = 'https://developer.nexmo.com/api-errors/messages-olympus#1110'
            )
        else:
            return ErrorChannelParams(
                detail = 'The value of one or more parameters is invalid.',
                instance = 'bf0ca0bf927b3b52e3cb03217e1a1ddf',
                title = 'Invalid channel parameters',
                type = 'https://developer.nexmo.com/api-errors/messages-olympus#1110',
        )
        """

    def testErrorChannelParams(self):
        """Test ErrorChannelParams"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
