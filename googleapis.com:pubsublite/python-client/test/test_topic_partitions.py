# coding: utf-8

"""
    Pub/Sub Lite API

    No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

    The version of the OpenAPI document: v1
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.topic_partitions import TopicPartitions

class TestTopicPartitions(unittest.TestCase):
    """TopicPartitions unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> TopicPartitions:
        """Test TopicPartitions
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `TopicPartitions`
        """
        model = TopicPartitions()
        if include_optional:
            return TopicPartitions(
                partition_count = ''
            )
        else:
            return TopicPartitions(
        )
        """

    def testTopicPartitions(self):
        """Test TopicPartitions"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
