# coding: utf-8

"""
    AWS Elemental MediaConvert

    AWS Elemental MediaConvert

    The version of the OpenAPI document: 2017-08-29
    Contact: mike.ralphson@gmail.com
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.create_job_template_response import CreateJobTemplateResponse

class TestCreateJobTemplateResponse(unittest.TestCase):
    """CreateJobTemplateResponse unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> CreateJobTemplateResponse:
        """Test CreateJobTemplateResponse
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `CreateJobTemplateResponse`
        """
        model = CreateJobTemplateResponse()
        if include_optional:
            return CreateJobTemplateResponse(
                job_template = None
            )
        else:
            return CreateJobTemplateResponse(
        )
        """

    def testCreateJobTemplateResponse(self):
        """Test CreateJobTemplateResponse"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
