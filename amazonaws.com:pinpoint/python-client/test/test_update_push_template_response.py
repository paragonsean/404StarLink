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

from openapi_client.models.update_push_template_response import UpdatePushTemplateResponse

class TestUpdatePushTemplateResponse(unittest.TestCase):
    """UpdatePushTemplateResponse unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> UpdatePushTemplateResponse:
        """Test UpdatePushTemplateResponse
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `UpdatePushTemplateResponse`
        """
        model = UpdatePushTemplateResponse()
        if include_optional:
            return UpdatePushTemplateResponse(
                message_body = openapi_client.models.message_body.MessageBody(
                    message = null, 
                    request_id = null, )
            )
        else:
            return UpdatePushTemplateResponse(
                message_body = openapi_client.models.message_body.MessageBody(
                    message = null, 
                    request_id = null, ),
        )
        """

    def testUpdatePushTemplateResponse(self):
        """Test UpdatePushTemplateResponse"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
