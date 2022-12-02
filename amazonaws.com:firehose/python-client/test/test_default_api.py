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

from openapi_client.api.default_api import DefaultApi


class TestDefaultApi(unittest.TestCase):
    """DefaultApi unit test stubs"""

    def setUp(self) -> None:
        self.api = DefaultApi()

    def tearDown(self) -> None:
        pass

    def test_create_delivery_stream(self) -> None:
        """Test case for create_delivery_stream

        """
        pass

    def test_delete_delivery_stream(self) -> None:
        """Test case for delete_delivery_stream

        """
        pass

    def test_describe_delivery_stream(self) -> None:
        """Test case for describe_delivery_stream

        """
        pass

    def test_list_delivery_streams(self) -> None:
        """Test case for list_delivery_streams

        """
        pass

    def test_list_tags_for_delivery_stream(self) -> None:
        """Test case for list_tags_for_delivery_stream

        """
        pass

    def test_put_record(self) -> None:
        """Test case for put_record

        """
        pass

    def test_put_record_batch(self) -> None:
        """Test case for put_record_batch

        """
        pass

    def test_start_delivery_stream_encryption(self) -> None:
        """Test case for start_delivery_stream_encryption

        """
        pass

    def test_stop_delivery_stream_encryption(self) -> None:
        """Test case for stop_delivery_stream_encryption

        """
        pass

    def test_tag_delivery_stream(self) -> None:
        """Test case for tag_delivery_stream

        """
        pass

    def test_untag_delivery_stream(self) -> None:
        """Test case for untag_delivery_stream

        """
        pass

    def test_update_destination(self) -> None:
        """Test case for update_destination

        """
        pass


if __name__ == '__main__':
    unittest.main()
