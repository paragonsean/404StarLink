# coding: utf-8

"""
    Migration Center API

    No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

    The version of the OpenAPI document: v1alpha1
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.runtime_network_info import RuntimeNetworkInfo

class TestRuntimeNetworkInfo(unittest.TestCase):
    """RuntimeNetworkInfo unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> RuntimeNetworkInfo:
        """Test RuntimeNetworkInfo
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `RuntimeNetworkInfo`
        """
        model = RuntimeNetworkInfo()
        if include_optional:
            return RuntimeNetworkInfo(
                connections = openapi_client.models.network_connection_list.NetworkConnectionList(
                    entries = [
                        openapi_client.models.network_connection.NetworkConnection(
                            local_ip_address = '', 
                            local_port = 56, 
                            pid = '', 
                            process_name = '', 
                            protocol = '', 
                            remote_ip_address = '', 
                            remote_port = 56, 
                            state = '', )
                        ], ),
                netstat = '',
                netstat_time = openapi_client.models.date_time.DateTime(
                    day = 56, 
                    hours = 56, 
                    minutes = 56, 
                    month = 56, 
                    nanos = 56, 
                    seconds = 56, 
                    time_zone = openapi_client.models.time_zone.TimeZone(
                        id = '', 
                        version = '', ), 
                    utc_offset = '', 
                    year = 56, )
            )
        else:
            return RuntimeNetworkInfo(
        )
        """

    def testRuntimeNetworkInfo(self):
        """Test RuntimeNetworkInfo"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
