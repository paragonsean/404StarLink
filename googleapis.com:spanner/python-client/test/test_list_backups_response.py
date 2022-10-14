# coding: utf-8

"""
    Cloud Spanner API

    Cloud Spanner is a managed, mission-critical, globally consistent and scalable relational database service.

    The version of the OpenAPI document: v1
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.list_backups_response import ListBackupsResponse

class TestListBackupsResponse(unittest.TestCase):
    """ListBackupsResponse unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> ListBackupsResponse:
        """Test ListBackupsResponse
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `ListBackupsResponse`
        """
        model = ListBackupsResponse()
        if include_optional:
            return ListBackupsResponse(
                backups = [
                    openapi_client.models.backup.Backup(
                        create_time = '', 
                        database = '', 
                        database_dialect = 'DATABASE_DIALECT_UNSPECIFIED', 
                        encryption_info = openapi_client.models.encryption_info.EncryptionInfo(
                            encryption_status = openapi_client.models.status.Status(
                                code = 56, 
                                details = [
                                    {
                                        'key' : null
                                        }
                                    ], 
                                message = '', ), 
                            encryption_type = 'TYPE_UNSPECIFIED', 
                            kms_key_version = '', ), 
                        expire_time = '', 
                        max_expire_time = '', 
                        name = '', 
                        referencing_backups = [
                            ''
                            ], 
                        referencing_databases = [
                            ''
                            ], 
                        size_bytes = '', 
                        state = 'STATE_UNSPECIFIED', 
                        version_time = '', )
                    ],
                next_page_token = ''
            )
        else:
            return ListBackupsResponse(
        )
        """

    def testListBackupsResponse(self):
        """Test ListBackupsResponse"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
