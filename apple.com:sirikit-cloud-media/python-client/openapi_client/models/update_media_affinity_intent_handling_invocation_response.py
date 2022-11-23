# coding: utf-8

"""
    SiriKit Cloud Media

    No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

    The version of the OpenAPI document: 1.0.2
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


from __future__ import annotations
import json
import pprint
from pydantic import BaseModel, ConfigDict, Field, StrictStr, ValidationError, field_validator
from typing import Any, List, Optional
from openapi_client.models.protocol_exception_invocation_response import ProtocolExceptionInvocationResponse
from openapi_client.models.update_media_affinity_intent_handling_handle_invocation_response import UpdateMediaAffinityIntentHandlingHandleInvocationResponse
from openapi_client.models.update_media_affinity_intent_handling_resolve_affinity_type_invocation_response import UpdateMediaAffinityIntentHandlingResolveAffinityTypeInvocationResponse
from openapi_client.models.update_media_affinity_intent_handling_resolve_media_items_invocation_response import UpdateMediaAffinityIntentHandlingResolveMediaItemsInvocationResponse
from pydantic import StrictStr, Field
from typing import Union, List, Set, Optional, Dict
from typing_extensions import Literal, Self

UPDATEMEDIAAFFINITYINTENTHANDLINGINVOCATIONRESPONSE_ONE_OF_SCHEMAS = ["ProtocolExceptionInvocationResponse", "UpdateMediaAffinityIntentHandlingHandleInvocationResponse", "UpdateMediaAffinityIntentHandlingResolveAffinityTypeInvocationResponse", "UpdateMediaAffinityIntentHandlingResolveMediaItemsInvocationResponse"]

class UpdateMediaAffinityIntentHandlingInvocationResponse(BaseModel):
    """
    UpdateMediaAffinityIntentHandlingInvocationResponse
    """
    # data type: UpdateMediaAffinityIntentHandlingResolveMediaItemsInvocationResponse
    oneof_schema_1_validator: Optional[UpdateMediaAffinityIntentHandlingResolveMediaItemsInvocationResponse] = None
    # data type: UpdateMediaAffinityIntentHandlingResolveAffinityTypeInvocationResponse
    oneof_schema_2_validator: Optional[UpdateMediaAffinityIntentHandlingResolveAffinityTypeInvocationResponse] = None
    # data type: UpdateMediaAffinityIntentHandlingHandleInvocationResponse
    oneof_schema_3_validator: Optional[UpdateMediaAffinityIntentHandlingHandleInvocationResponse] = None
    # data type: ProtocolExceptionInvocationResponse
    oneof_schema_4_validator: Optional[ProtocolExceptionInvocationResponse] = None
    actual_instance: Optional[Union[ProtocolExceptionInvocationResponse, UpdateMediaAffinityIntentHandlingHandleInvocationResponse, UpdateMediaAffinityIntentHandlingResolveAffinityTypeInvocationResponse, UpdateMediaAffinityIntentHandlingResolveMediaItemsInvocationResponse]] = None
    one_of_schemas: Set[str] = { "ProtocolExceptionInvocationResponse", "UpdateMediaAffinityIntentHandlingHandleInvocationResponse", "UpdateMediaAffinityIntentHandlingResolveAffinityTypeInvocationResponse", "UpdateMediaAffinityIntentHandlingResolveMediaItemsInvocationResponse" }

    model_config = ConfigDict(
        validate_assignment=True,
        protected_namespaces=(),
    )


    discriminator_value_class_map: Dict[str, str] = {
    }

    def __init__(self, *args, **kwargs) -> None:
        if args:
            if len(args) > 1:
                raise ValueError("If a position argument is used, only 1 is allowed to set `actual_instance`")
            if kwargs:
                raise ValueError("If a position argument is used, keyword arguments cannot be used.")
            super().__init__(actual_instance=args[0])
        else:
            super().__init__(**kwargs)

    @field_validator('actual_instance')
    def actual_instance_must_validate_oneof(cls, v):
        instance = UpdateMediaAffinityIntentHandlingInvocationResponse.model_construct()
        error_messages = []
        match = 0
        # validate data type: UpdateMediaAffinityIntentHandlingResolveMediaItemsInvocationResponse
        if not isinstance(v, UpdateMediaAffinityIntentHandlingResolveMediaItemsInvocationResponse):
            error_messages.append(f"Error! Input type `{type(v)}` is not `UpdateMediaAffinityIntentHandlingResolveMediaItemsInvocationResponse`")
        else:
            match += 1
        # validate data type: UpdateMediaAffinityIntentHandlingResolveAffinityTypeInvocationResponse
        if not isinstance(v, UpdateMediaAffinityIntentHandlingResolveAffinityTypeInvocationResponse):
            error_messages.append(f"Error! Input type `{type(v)}` is not `UpdateMediaAffinityIntentHandlingResolveAffinityTypeInvocationResponse`")
        else:
            match += 1
        # validate data type: UpdateMediaAffinityIntentHandlingHandleInvocationResponse
        if not isinstance(v, UpdateMediaAffinityIntentHandlingHandleInvocationResponse):
            error_messages.append(f"Error! Input type `{type(v)}` is not `UpdateMediaAffinityIntentHandlingHandleInvocationResponse`")
        else:
            match += 1
        # validate data type: ProtocolExceptionInvocationResponse
        if not isinstance(v, ProtocolExceptionInvocationResponse):
            error_messages.append(f"Error! Input type `{type(v)}` is not `ProtocolExceptionInvocationResponse`")
        else:
            match += 1
        if match > 1:
            # more than 1 match
            raise ValueError("Multiple matches found when setting `actual_instance` in UpdateMediaAffinityIntentHandlingInvocationResponse with oneOf schemas: ProtocolExceptionInvocationResponse, UpdateMediaAffinityIntentHandlingHandleInvocationResponse, UpdateMediaAffinityIntentHandlingResolveAffinityTypeInvocationResponse, UpdateMediaAffinityIntentHandlingResolveMediaItemsInvocationResponse. Details: " + ", ".join(error_messages))
        elif match == 0:
            # no match
            raise ValueError("No match found when setting `actual_instance` in UpdateMediaAffinityIntentHandlingInvocationResponse with oneOf schemas: ProtocolExceptionInvocationResponse, UpdateMediaAffinityIntentHandlingHandleInvocationResponse, UpdateMediaAffinityIntentHandlingResolveAffinityTypeInvocationResponse, UpdateMediaAffinityIntentHandlingResolveMediaItemsInvocationResponse. Details: " + ", ".join(error_messages))
        else:
            return v

    @classmethod
    def from_dict(cls, obj: Union[str, Dict[str, Any]]) -> Self:
        return cls.from_json(json.dumps(obj))

    @classmethod
    def from_json(cls, json_str: str) -> Self:
        """Returns the object represented by the json string"""
        instance = cls.model_construct()
        error_messages = []
        match = 0

        # deserialize data into UpdateMediaAffinityIntentHandlingResolveMediaItemsInvocationResponse
        try:
            instance.actual_instance = UpdateMediaAffinityIntentHandlingResolveMediaItemsInvocationResponse.from_json(json_str)
            match += 1
        except (ValidationError, ValueError) as e:
            error_messages.append(str(e))
        # deserialize data into UpdateMediaAffinityIntentHandlingResolveAffinityTypeInvocationResponse
        try:
            instance.actual_instance = UpdateMediaAffinityIntentHandlingResolveAffinityTypeInvocationResponse.from_json(json_str)
            match += 1
        except (ValidationError, ValueError) as e:
            error_messages.append(str(e))
        # deserialize data into UpdateMediaAffinityIntentHandlingHandleInvocationResponse
        try:
            instance.actual_instance = UpdateMediaAffinityIntentHandlingHandleInvocationResponse.from_json(json_str)
            match += 1
        except (ValidationError, ValueError) as e:
            error_messages.append(str(e))
        # deserialize data into ProtocolExceptionInvocationResponse
        try:
            instance.actual_instance = ProtocolExceptionInvocationResponse.from_json(json_str)
            match += 1
        except (ValidationError, ValueError) as e:
            error_messages.append(str(e))

        if match > 1:
            # more than 1 match
            raise ValueError("Multiple matches found when deserializing the JSON string into UpdateMediaAffinityIntentHandlingInvocationResponse with oneOf schemas: ProtocolExceptionInvocationResponse, UpdateMediaAffinityIntentHandlingHandleInvocationResponse, UpdateMediaAffinityIntentHandlingResolveAffinityTypeInvocationResponse, UpdateMediaAffinityIntentHandlingResolveMediaItemsInvocationResponse. Details: " + ", ".join(error_messages))
        elif match == 0:
            # no match
            raise ValueError("No match found when deserializing the JSON string into UpdateMediaAffinityIntentHandlingInvocationResponse with oneOf schemas: ProtocolExceptionInvocationResponse, UpdateMediaAffinityIntentHandlingHandleInvocationResponse, UpdateMediaAffinityIntentHandlingResolveAffinityTypeInvocationResponse, UpdateMediaAffinityIntentHandlingResolveMediaItemsInvocationResponse. Details: " + ", ".join(error_messages))
        else:
            return instance

    def to_json(self) -> str:
        """Returns the JSON representation of the actual instance"""
        if self.actual_instance is None:
            return "null"

        if hasattr(self.actual_instance, "to_json") and callable(self.actual_instance.to_json):
            return self.actual_instance.to_json()
        else:
            return json.dumps(self.actual_instance)

    def to_dict(self) -> Optional[Union[Dict[str, Any], ProtocolExceptionInvocationResponse, UpdateMediaAffinityIntentHandlingHandleInvocationResponse, UpdateMediaAffinityIntentHandlingResolveAffinityTypeInvocationResponse, UpdateMediaAffinityIntentHandlingResolveMediaItemsInvocationResponse]]:
        """Returns the dict representation of the actual instance"""
        if self.actual_instance is None:
            return None

        if hasattr(self.actual_instance, "to_dict") and callable(self.actual_instance.to_dict):
            return self.actual_instance.to_dict()
        else:
            # primitive type
            return self.actual_instance

    def to_str(self) -> str:
        """Returns the string representation of the actual instance"""
        return pprint.pformat(self.model_dump())


