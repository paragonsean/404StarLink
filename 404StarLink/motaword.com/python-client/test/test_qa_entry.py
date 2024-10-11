# coding: utf-8

"""
    MotaWord API

    Use MotaWord API to post and track your translation projects.

    The version of the OpenAPI document: 1.0
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.qa_entry import QaEntry

class TestQaEntry(unittest.TestCase):
    """QaEntry unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> QaEntry:
        """Test QaEntry
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `QaEntry`
        """
        model = QaEntry()
        if include_optional:
            return QaEntry(
                category = '',
                comment = '',
                doc_id = '',
                editor_link = '',
                end = 56,
                in_source = True,
                is_current = True,
                module = '',
                project_id = openapi_client.models.simple_model.SimpleModel(
                    id = 56, 
                    name = '', ),
                severity = '',
                source = '',
                source_language = openapi_client.models.simple_model.SimpleModel(
                    id = 56, 
                    name = '', ),
                start = 56,
                state = '',
                target_language = openapi_client.models.simple_model.SimpleModel(
                    id = 56, 
                    name = '', ),
                translation = '',
                unique_key = '',
                vendor = openapi_client.models.simple_model.SimpleModel(
                    id = 56, 
                    name = '', )
            )
        else:
            return QaEntry(
        )
        """

    def testQaEntry(self):
        """Test QaEntry"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
