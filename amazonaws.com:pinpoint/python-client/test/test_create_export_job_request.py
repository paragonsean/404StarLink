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

from openapi_client.models.create_export_job_request import CreateExportJobRequest

class TestCreateExportJobRequest(unittest.TestCase):
    """CreateExportJobRequest unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> CreateExportJobRequest:
        """Test CreateExportJobRequest
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `CreateExportJobRequest`
        """
        model = CreateExportJobRequest()
        if include_optional:
            return CreateExportJobRequest(
                export_job_request = openapi_client.models.create_export_job_request_export_job_request.CreateExportJob_request_ExportJobRequest(
                    role_arn = null, 
                    s3_url_prefix = null, 
                    segment_id = null, 
                    segment_version = null, )
            )
        else:
            return CreateExportJobRequest(
                export_job_request = openapi_client.models.create_export_job_request_export_job_request.CreateExportJob_request_ExportJobRequest(
                    role_arn = null, 
                    s3_url_prefix = null, 
                    segment_id = null, 
                    segment_version = null, ),
        )
        """

    def testCreateExportJobRequest(self):
        """Test CreateExportJobRequest"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
