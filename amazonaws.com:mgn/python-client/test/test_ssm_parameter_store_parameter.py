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

from openapi_client.models.ssm_parameter_store_parameter import SsmParameterStoreParameter

class TestSsmParameterStoreParameter(unittest.TestCase):
    """SsmParameterStoreParameter unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> SsmParameterStoreParameter:
        """Test SsmParameterStoreParameter
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `SsmParameterStoreParameter`
        """
        model = SsmParameterStoreParameter()
        if include_optional:
            return SsmParameterStoreParameter(
                parameter_name = None,
                parameter_type = None
            )
        else:
            return SsmParameterStoreParameter(
                parameter_name = None,
                parameter_type = None,
        )
        """

    def testSsmParameterStoreParameter(self):
        """Test SsmParameterStoreParameter"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
