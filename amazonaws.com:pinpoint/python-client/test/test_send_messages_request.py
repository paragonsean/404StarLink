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

from openapi_client.models.send_messages_request import SendMessagesRequest

class TestSendMessagesRequest(unittest.TestCase):
    """SendMessagesRequest unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> SendMessagesRequest:
        """Test SendMessagesRequest
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `SendMessagesRequest`
        """
        model = SendMessagesRequest()
        if include_optional:
            return SendMessagesRequest(
                message_request = openapi_client.models.send_messages_request_message_request.SendMessages_request_MessageRequest(
                    addresses = null, 
                    context = null, 
                    endpoints = null, 
                    message_configuration = null, 
                    template_configuration = null, 
                    trace_id = null, )
            )
        else:
            return SendMessagesRequest(
                message_request = openapi_client.models.send_messages_request_message_request.SendMessages_request_MessageRequest(
                    addresses = null, 
                    context = null, 
                    endpoints = null, 
                    message_configuration = null, 
                    template_configuration = null, 
                    trace_id = null, ),
        )
        """

    def testSendMessagesRequest(self):
        """Test SendMessagesRequest"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
