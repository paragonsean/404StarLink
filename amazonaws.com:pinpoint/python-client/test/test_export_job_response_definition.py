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

from openapi_client.models.export_job_response_definition import ExportJobResponseDefinition

class TestExportJobResponseDefinition(unittest.TestCase):
    """ExportJobResponseDefinition unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> ExportJobResponseDefinition:
        """Test ExportJobResponseDefinition
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `ExportJobResponseDefinition`
        """
        model = ExportJobResponseDefinition()
        if include_optional:
            return ExportJobResponseDefinition(
                role_arn = None,
                s3_url_prefix = None,
                segment_id = None,
                segment_version = None
            )
        else:
            return ExportJobResponseDefinition(
                role_arn = None,
                s3_url_prefix = None,
        )
        """

    def testExportJobResponseDefinition(self):
        """Test ExportJobResponseDefinition"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
