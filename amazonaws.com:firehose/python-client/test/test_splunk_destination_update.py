# coding: utf-8

"""
    Amazon Kinesis Firehose

    <fullname>Amazon Kinesis Data Firehose API Reference</fullname> <p>Amazon Kinesis Data Firehose is a fully managed service that delivers real-time streaming data to destinations such as Amazon Simple Storage Service (Amazon S3), Amazon OpenSearch Service, Amazon Redshift, Splunk, and various other supportd destinations.</p>

    The version of the OpenAPI document: 2015-08-04
    Contact: mike.ralphson@gmail.com
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.splunk_destination_update import SplunkDestinationUpdate

class TestSplunkDestinationUpdate(unittest.TestCase):
    """SplunkDestinationUpdate unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> SplunkDestinationUpdate:
        """Test SplunkDestinationUpdate
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `SplunkDestinationUpdate`
        """
        model = SplunkDestinationUpdate()
        if include_optional:
            return SplunkDestinationUpdate(
                hec_endpoint = None,
                hec_endpoint_type = None,
                hec_token = None,
                hec_acknowledgment_timeout_in_seconds = None,
                retry_options = None,
                s3_backup_mode = None,
                s3_update = None,
                processing_configuration = None,
                cloud_watch_logging_options = None
            )
        else:
            return SplunkDestinationUpdate(
        )
        """

    def testSplunkDestinationUpdate(self):
        """Test SplunkDestinationUpdate"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
