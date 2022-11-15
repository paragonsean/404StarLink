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

from openapi_client.models.error_invalid_json import ErrorInvalidJson

class TestErrorInvalidJson(unittest.TestCase):
    """ErrorInvalidJson unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> ErrorInvalidJson:
        """Test ErrorInvalidJson
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `ErrorInvalidJson`
        """
        model = ErrorInvalidJson()
        if include_optional:
            return ErrorInvalidJson(
                detail = 'Unexpected character ('"' (code 34)): was expecting comma to separate Object entries',
                instance = 'bf0ca0bf927b3b52e3cb03217e1a1ddf',
                title = 'The request body did not contain valid JSON',
                type = 'https://developer.nexmo.com/api-errors#invalid-json'
            )
        else:
            return ErrorInvalidJson(
                detail = 'Unexpected character ('"' (code 34)): was expecting comma to separate Object entries',
                instance = 'bf0ca0bf927b3b52e3cb03217e1a1ddf',
                title = 'The request body did not contain valid JSON',
                type = 'https://developer.nexmo.com/api-errors#invalid-json',
        )
        """

    def testErrorInvalidJson(self):
        """Test ErrorInvalidJson"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
