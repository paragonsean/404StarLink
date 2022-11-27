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

from openapi_client.models.send_users_messages_response import SendUsersMessagesResponse

class TestSendUsersMessagesResponse(unittest.TestCase):
    """SendUsersMessagesResponse unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> SendUsersMessagesResponse:
        """Test SendUsersMessagesResponse
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `SendUsersMessagesResponse`
        """
        model = SendUsersMessagesResponse()
        if include_optional:
            return SendUsersMessagesResponse(
                send_users_message_response = openapi_client.models.send_users_message_response.SendUsersMessageResponse(
                    application_id = null, 
                    request_id = null, 
                    result = null, )
            )
        else:
            return SendUsersMessagesResponse(
                send_users_message_response = openapi_client.models.send_users_message_response.SendUsersMessageResponse(
                    application_id = null, 
                    request_id = null, 
                    result = null, ),
        )
        """

    def testSendUsersMessagesResponse(self):
        """Test SendUsersMessagesResponse"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
