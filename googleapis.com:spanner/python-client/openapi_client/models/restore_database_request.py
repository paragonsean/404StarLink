# coding: utf-8

"""
    Cloud Spanner API

    Cloud Spanner is a managed, mission-critical, globally consistent and scalable relational database service.

    The version of the OpenAPI document: v1
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


from __future__ import annotations
import pprint
import re  # noqa: F401
import json

from pydantic import BaseModel, ConfigDict, Field, StrictStr
from typing import Any, ClassVar, Dict, List, Optional
from openapi_client.models.restore_database_encryption_config import RestoreDatabaseEncryptionConfig
from typing import Optional, Set
from typing_extensions import Self

class RestoreDatabaseRequest(BaseModel):
    """
    The request for RestoreDatabase.
    """ # noqa: E501
    backup: Optional[StrictStr] = Field(default=None, description="Name of the backup from which to restore. Values are of the form `projects//instances//backups/`.")
    database_id: Optional[StrictStr] = Field(default=None, description="Required. The id of the database to create and restore to. This database must not already exist. The `database_id` appended to `parent` forms the full database name of the form `projects//instances//databases/`.", alias="databaseId")
    encryption_config: Optional[RestoreDatabaseEncryptionConfig] = Field(default=None, alias="encryptionConfig")
    __properties: ClassVar[List[str]] = ["backup", "databaseId", "encryptionConfig"]

    model_config = ConfigDict(
        populate_by_name=True,
        validate_assignment=True,
        protected_namespaces=(),
    )


    def to_str(self) -> str:
        """Returns the string representation of the model using alias"""
        return pprint.pformat(self.model_dump(by_alias=True))

    def to_json(self) -> str:
        """Returns the JSON representation of the model using alias"""
        # TODO: pydantic v2: use .model_dump_json(by_alias=True, exclude_unset=True) instead
        return json.dumps(self.to_dict())

    @classmethod
    def from_json(cls, json_str: str) -> Optional[Self]:
        """Create an instance of RestoreDatabaseRequest from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self) -> Dict[str, Any]:
        """Return the dictionary representation of the model using alias.

        This has the following differences from calling pydantic's
        `self.model_dump(by_alias=True)`:

        * `None` is only added to the output dict for nullable fields that
          were set at model initialization. Other fields with value `None`
          are ignored.
        """
        excluded_fields: Set[str] = set([
        ])

        _dict = self.model_dump(
            by_alias=True,
            exclude=excluded_fields,
            exclude_none=True,
        )
        # override the default output from pydantic by calling `to_dict()` of encryption_config
        if self.encryption_config:
            _dict['encryptionConfig'] = self.encryption_config.to_dict()
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of RestoreDatabaseRequest from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "backup": obj.get("backup"),
            "databaseId": obj.get("databaseId"),
            "encryptionConfig": RestoreDatabaseEncryptionConfig.from_dict(obj["encryptionConfig"]) if obj.get("encryptionConfig") is not None else None
        })
        return _obj


