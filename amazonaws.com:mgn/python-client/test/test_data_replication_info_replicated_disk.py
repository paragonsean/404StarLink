# coding: utf-8

"""
    Application Migration Service

    The Application Migration Service service.

    The version of the OpenAPI document: 2020-02-26
    Contact: mike.ralphson@gmail.com
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.data_replication_info_replicated_disk import DataReplicationInfoReplicatedDisk

class TestDataReplicationInfoReplicatedDisk(unittest.TestCase):
    """DataReplicationInfoReplicatedDisk unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> DataReplicationInfoReplicatedDisk:
        """Test DataReplicationInfoReplicatedDisk
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `DataReplicationInfoReplicatedDisk`
        """
        model = DataReplicationInfoReplicatedDisk()
        if include_optional:
            return DataReplicationInfoReplicatedDisk(
                backlogged_storage_bytes = None,
                device_name = None,
                replicated_storage_bytes = None,
                rescanned_storage_bytes = None,
                total_storage_bytes = None
            )
        else:
            return DataReplicationInfoReplicatedDisk(
        )
        """

    def testDataReplicationInfoReplicatedDisk(self):
        """Test DataReplicationInfoReplicatedDisk"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
