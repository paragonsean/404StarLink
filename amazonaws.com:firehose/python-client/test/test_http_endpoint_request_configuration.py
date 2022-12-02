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

from openapi_client.models.http_endpoint_request_configuration import HttpEndpointRequestConfiguration

class TestHttpEndpointRequestConfiguration(unittest.TestCase):
    """HttpEndpointRequestConfiguration unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> HttpEndpointRequestConfiguration:
        """Test HttpEndpointRequestConfiguration
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `HttpEndpointRequestConfiguration`
        """
        model = HttpEndpointRequestConfiguration()
        if include_optional:
            return HttpEndpointRequestConfiguration(
                content_encoding = None,
                common_attributes = None
            )
        else:
            return HttpEndpointRequestConfiguration(
        )
        """

    def testHttpEndpointRequestConfiguration(self):
        """Test HttpEndpointRequestConfiguration"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
