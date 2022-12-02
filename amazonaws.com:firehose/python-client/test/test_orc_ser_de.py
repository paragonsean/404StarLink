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

from openapi_client.models.orc_ser_de import OrcSerDe

class TestOrcSerDe(unittest.TestCase):
    """OrcSerDe unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> OrcSerDe:
        """Test OrcSerDe
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `OrcSerDe`
        """
        model = OrcSerDe()
        if include_optional:
            return OrcSerDe(
                stripe_size_bytes = None,
                block_size_bytes = None,
                row_index_stride = None,
                enable_padding = None,
                padding_tolerance = None,
                compression = None,
                bloom_filter_columns = None,
                bloom_filter_false_positive_probability = None,
                dictionary_key_threshold = None,
                format_version = None
            )
        else:
            return OrcSerDe(
        )
        """

    def testOrcSerDe(self):
        """Test OrcSerDe"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
