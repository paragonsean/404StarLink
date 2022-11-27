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

from openapi_client.models.update_sms_template_request_sms_template_request import UpdateSmsTemplateRequestSMSTemplateRequest

class TestUpdateSmsTemplateRequestSMSTemplateRequest(unittest.TestCase):
    """UpdateSmsTemplateRequestSMSTemplateRequest unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> UpdateSmsTemplateRequestSMSTemplateRequest:
        """Test UpdateSmsTemplateRequestSMSTemplateRequest
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `UpdateSmsTemplateRequestSMSTemplateRequest`
        """
        model = UpdateSmsTemplateRequestSMSTemplateRequest()
        if include_optional:
            return UpdateSmsTemplateRequestSMSTemplateRequest(
                body = None,
                default_substitutions = None,
                recommender_id = None,
                tags = None,
                template_description = None
            )
        else:
            return UpdateSmsTemplateRequestSMSTemplateRequest(
        )
        """

    def testUpdateSmsTemplateRequestSMSTemplateRequest(self):
        """Test UpdateSmsTemplateRequestSMSTemplateRequest"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
