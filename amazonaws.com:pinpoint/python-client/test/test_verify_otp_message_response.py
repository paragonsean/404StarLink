# coding: utf-8

"""
    Amazon Pinpoint

    Doc Engage API - Amazon Pinpoint API

    The version of the OpenAPI document: 2016-12-01
    Contact: mike.ralphson@gmail.com
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.verify_otp_message_response import VerifyOTPMessageResponse

class TestVerifyOTPMessageResponse(unittest.TestCase):
    """VerifyOTPMessageResponse unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> VerifyOTPMessageResponse:
        """Test VerifyOTPMessageResponse
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `VerifyOTPMessageResponse`
        """
        model = VerifyOTPMessageResponse()
        if include_optional:
            return VerifyOTPMessageResponse(
                verification_response = openapi_client.models.verification_response.VerificationResponse(
                    valid = null, )
            )
        else:
            return VerifyOTPMessageResponse(
                verification_response = openapi_client.models.verification_response.VerificationResponse(
                    valid = null, ),
        )
        """

    def testVerifyOTPMessageResponse(self):
        """Test VerifyOTPMessageResponse"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
