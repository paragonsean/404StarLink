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

from openapi_client.models.dynamic_partitioning_configuration_retry_options import DynamicPartitioningConfigurationRetryOptions

class TestDynamicPartitioningConfigurationRetryOptions(unittest.TestCase):
    """DynamicPartitioningConfigurationRetryOptions unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> DynamicPartitioningConfigurationRetryOptions:
        """Test DynamicPartitioningConfigurationRetryOptions
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `DynamicPartitioningConfigurationRetryOptions`
        """
        model = DynamicPartitioningConfigurationRetryOptions()
        if include_optional:
            return DynamicPartitioningConfigurationRetryOptions(
                duration_in_seconds = None
            )
        else:
            return DynamicPartitioningConfigurationRetryOptions(
        )
        """

    def testDynamicPartitioningConfigurationRetryOptions(self):
        """Test DynamicPartitioningConfigurationRetryOptions"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
