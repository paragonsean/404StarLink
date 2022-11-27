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

from openapi_client.models.send_otp_message_request import SendOTPMessageRequest

class TestSendOTPMessageRequest(unittest.TestCase):
    """SendOTPMessageRequest unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> SendOTPMessageRequest:
        """Test SendOTPMessageRequest
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `SendOTPMessageRequest`
        """
        model = SendOTPMessageRequest()
        if include_optional:
            return SendOTPMessageRequest(
                send_otp_message_request_parameters = openapi_client.models.send_otp_message_request_send_otp_message_request_parameters.SendOTPMessage_request_SendOTPMessageRequestParameters(
                    allowed_attempts = null, 
                    brand_name = null, 
                    channel = null, 
                    code_length = null, 
                    destination_identity = null, 
                    entity_id = null, 
                    language = null, 
                    origination_identity = null, 
                    reference_id = null, 
                    template_id = null, 
                    validity_period = null, )
            )
        else:
            return SendOTPMessageRequest(
                send_otp_message_request_parameters = openapi_client.models.send_otp_message_request_send_otp_message_request_parameters.SendOTPMessage_request_SendOTPMessageRequestParameters(
                    allowed_attempts = null, 
                    brand_name = null, 
                    channel = null, 
                    code_length = null, 
                    destination_identity = null, 
                    entity_id = null, 
                    language = null, 
                    origination_identity = null, 
                    reference_id = null, 
                    template_id = null, 
                    validity_period = null, ),
        )
        """

    def testSendOTPMessageRequest(self):
        """Test SendOTPMessageRequest"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
