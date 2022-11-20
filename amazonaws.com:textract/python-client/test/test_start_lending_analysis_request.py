# coding: utf-8

"""
    Amazon Textract

    Amazon Textract detects and analyzes text in documents and converts it into machine-readable text. This is the API reference documentation for Amazon Textract.

    The version of the OpenAPI document: 2018-06-27
    Contact: mike.ralphson@gmail.com
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.start_lending_analysis_request import StartLendingAnalysisRequest

class TestStartLendingAnalysisRequest(unittest.TestCase):
    """StartLendingAnalysisRequest unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> StartLendingAnalysisRequest:
        """Test StartLendingAnalysisRequest
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `StartLendingAnalysisRequest`
        """
        model = StartLendingAnalysisRequest()
        if include_optional:
            return StartLendingAnalysisRequest(
                document_location = openapi_client.models.document_location.DocumentLocation(
                    s3_object = null, ),
                client_request_token = None,
                job_tag = None,
                notification_channel = openapi_client.models.notification_channel.NotificationChannel(
                    sns_topic_arn = null, 
                    role_arn = null, ),
                output_config = openapi_client.models.output_config.OutputConfig(
                    s3_bucket = null, 
                    s3_prefix = null, ),
                kms_key_id = None
            )
        else:
            return StartLendingAnalysisRequest(
                document_location = openapi_client.models.document_location.DocumentLocation(
                    s3_object = null, ),
        )
        """

    def testStartLendingAnalysisRequest(self):
        """Test StartLendingAnalysisRequest"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
