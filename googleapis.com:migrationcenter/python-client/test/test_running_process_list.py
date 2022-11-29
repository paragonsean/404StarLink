# coding: utf-8

"""
    Migration Center API

    No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

    The version of the OpenAPI document: v1alpha1
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.running_process_list import RunningProcessList

class TestRunningProcessList(unittest.TestCase):
    """RunningProcessList unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> RunningProcessList:
        """Test RunningProcessList
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `RunningProcessList`
        """
        model = RunningProcessList()
        if include_optional:
            return RunningProcessList(
                processes = [
                    openapi_client.models.running_process.RunningProcess(
                        attributes = {
                            'key' : ''
                            }, 
                        cmdline = '', 
                        exe_path = '', 
                        pid = '', 
                        user = '', )
                    ]
            )
        else:
            return RunningProcessList(
        )
        """

    def testRunningProcessList(self):
        """Test RunningProcessList"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
