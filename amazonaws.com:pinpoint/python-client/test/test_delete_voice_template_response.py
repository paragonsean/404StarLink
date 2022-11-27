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

from openapi_client.models.delete_voice_template_response import DeleteVoiceTemplateResponse

class TestDeleteVoiceTemplateResponse(unittest.TestCase):
    """DeleteVoiceTemplateResponse unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> DeleteVoiceTemplateResponse:
        """Test DeleteVoiceTemplateResponse
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `DeleteVoiceTemplateResponse`
        """
        model = DeleteVoiceTemplateResponse()
        if include_optional:
            return DeleteVoiceTemplateResponse(
                message_body = openapi_client.models.message_body.MessageBody(
                    message = null, 
                    request_id = null, )
            )
        else:
            return DeleteVoiceTemplateResponse(
                message_body = openapi_client.models.message_body.MessageBody(
                    message = null, 
                    request_id = null, ),
        )
        """

    def testDeleteVoiceTemplateResponse(self):
        """Test DeleteVoiceTemplateResponse"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
