# coding: utf-8

"""
    GitHub v3 REST API

    GitHub's v3 REST API.

    The version of the OpenAPI document: 1.1.4
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.maintenance_status import MaintenanceStatus

class TestMaintenanceStatus(unittest.TestCase):
    """MaintenanceStatus unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> MaintenanceStatus:
        """Test MaintenanceStatus
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `MaintenanceStatus`
        """
        model = MaintenanceStatus()
        if include_optional:
            return MaintenanceStatus(
                connection_services = [
                    openapi_client.models.maintenance_status_connection_services_inner.maintenance_status_connection_services_inner(
                        name = '', 
                        number = 56, )
                    ],
                scheduled_time = '',
                status = ''
            )
        else:
            return MaintenanceStatus(
        )
        """

    def testMaintenanceStatus(self):
        """Test MaintenanceStatus"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
