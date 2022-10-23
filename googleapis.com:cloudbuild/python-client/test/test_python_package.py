# coding: utf-8

"""
    Cloud Build API

    Creates and manages builds on Google Cloud Platform.

    The version of the OpenAPI document: v1
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.python_package import PythonPackage

class TestPythonPackage(unittest.TestCase):
    """PythonPackage unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> PythonPackage:
        """Test PythonPackage
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `PythonPackage`
        """
        model = PythonPackage()
        if include_optional:
            return PythonPackage(
                paths = [
                    ''
                    ],
                repository = ''
            )
        else:
            return PythonPackage(
        )
        """

    def testPythonPackage(self):
        """Test PythonPackage"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
