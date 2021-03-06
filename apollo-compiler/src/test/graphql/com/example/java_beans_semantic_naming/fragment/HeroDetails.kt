// AUTO-GENERATED FILE. DO NOT MODIFY.
//
// This class was automatically generated by Apollo GraphQL plugin from the GraphQL queries it found.
// It should not be modified by hand.
//
package com.example.java_beans_semantic_naming.fragment

import com.apollographql.apollo.api.GraphqlFragment
import com.apollographql.apollo.api.ResponseField
import com.apollographql.apollo.api.ResponseFieldMarshaller
import com.apollographql.apollo.api.ResponseReader
import kotlin.Array
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.collections.List

@Suppress("NAME_SHADOWING", "UNUSED_ANONYMOUS_PARAMETER", "LocalVariableName",
    "RemoveExplicitTypeArguments", "NestedLambdaShadowedImplicitParameter")
data class HeroDetails(
  val __typename: String = "Character",
  /**
   * The name of the character
   */
  val name: String,
  /**
   * The friends of the character exposed as a connection with edges
   */
  val friendsConnection: FriendsConnection,
  val asDroid: AsDroid?
) : GraphqlFragment {
  override fun marshaller(): ResponseFieldMarshaller = ResponseFieldMarshaller {
    it.writeString(RESPONSE_FIELDS[0], __typename)
    it.writeString(RESPONSE_FIELDS[1], name)
    it.writeObject(RESPONSE_FIELDS[2], friendsConnection.marshaller())
    it.writeFragment(asDroid?.marshaller())
  }

  companion object {
    private val RESPONSE_FIELDS: Array<ResponseField> = arrayOf(
        ResponseField.forString("__typename", "__typename", null, false, null),
        ResponseField.forString("name", "name", null, false, null),
        ResponseField.forObject("friendsConnection", "friendsConnection", null, false, null),
        ResponseField.forFragment("__typename", "__typename", listOf(
          ResponseField.Condition.typeCondition(arrayOf("Droid"))
        ))
        )

    val FRAGMENT_DEFINITION: String = """
        |fragment HeroDetails on Character {
        |  __typename
        |  name
        |  friendsConnection {
        |    __typename
        |    totalCount
        |    edges {
        |      __typename
        |      node {
        |        __typename
        |        name
        |      }
        |    }
        |    pageInfo {
        |      __typename
        |      hasNextPage
        |    }
        |    isEmpty
        |  }
        |  ... on Droid {
        |    name
        |    primaryFunction
        |  }
        |}
        """.trimMargin()

    operator fun invoke(reader: ResponseReader): HeroDetails {
      val __typename = reader.readString(RESPONSE_FIELDS[0])
      val name = reader.readString(RESPONSE_FIELDS[1])
      val friendsConnection = reader.readObject<FriendsConnection>(RESPONSE_FIELDS[2]) { reader ->
        FriendsConnection(reader)
      }

      val asDroid = reader.readFragment<AsDroid>(RESPONSE_FIELDS[3]) { reader ->
        AsDroid(reader)
      }
      return HeroDetails(
        __typename = __typename,
        name = name,
        friendsConnection = friendsConnection,
        asDroid = asDroid
      )
    }
  }

  data class Node(
    val __typename: String = "Character",
    /**
     * The name of the character
     */
    val name: String
  ) {
    fun marshaller(): ResponseFieldMarshaller = ResponseFieldMarshaller {
      it.writeString(RESPONSE_FIELDS[0], __typename)
      it.writeString(RESPONSE_FIELDS[1], name)
    }

    companion object {
      private val RESPONSE_FIELDS: Array<ResponseField> = arrayOf(
          ResponseField.forString("__typename", "__typename", null, false, null),
          ResponseField.forString("name", "name", null, false, null)
          )

      operator fun invoke(reader: ResponseReader): Node {
        val __typename = reader.readString(RESPONSE_FIELDS[0])
        val name = reader.readString(RESPONSE_FIELDS[1])
        return Node(
          __typename = __typename,
          name = name
        )
      }
    }
  }

  data class Edge(
    val __typename: String = "FriendsEdge",
    /**
     * The character represented by this friendship edge
     */
    val node: Node?
  ) {
    fun marshaller(): ResponseFieldMarshaller = ResponseFieldMarshaller {
      it.writeString(RESPONSE_FIELDS[0], __typename)
      it.writeObject(RESPONSE_FIELDS[1], node?.marshaller())
    }

    companion object {
      private val RESPONSE_FIELDS: Array<ResponseField> = arrayOf(
          ResponseField.forString("__typename", "__typename", null, false, null),
          ResponseField.forObject("node", "node", null, true, null)
          )

      operator fun invoke(reader: ResponseReader): Edge {
        val __typename = reader.readString(RESPONSE_FIELDS[0])
        val node = reader.readObject<Node>(RESPONSE_FIELDS[1]) { reader ->
          Node(reader)
        }

        return Edge(
          __typename = __typename,
          node = node
        )
      }
    }
  }

  data class PageInfo(
    val __typename: String = "PageInfo",
    val hasNextPage: Boolean
  ) {
    fun marshaller(): ResponseFieldMarshaller = ResponseFieldMarshaller {
      it.writeString(RESPONSE_FIELDS[0], __typename)
      it.writeBoolean(RESPONSE_FIELDS[1], hasNextPage)
    }

    companion object {
      private val RESPONSE_FIELDS: Array<ResponseField> = arrayOf(
          ResponseField.forString("__typename", "__typename", null, false, null),
          ResponseField.forBoolean("hasNextPage", "hasNextPage", null, false, null)
          )

      operator fun invoke(reader: ResponseReader): PageInfo {
        val __typename = reader.readString(RESPONSE_FIELDS[0])
        val hasNextPage = reader.readBoolean(RESPONSE_FIELDS[1])
        return PageInfo(
          __typename = __typename,
          hasNextPage = hasNextPage
        )
      }
    }
  }

  data class FriendsConnection(
    val __typename: String = "FriendsConnection",
    /**
     * The total number of friends
     */
    val totalCount: Int?,
    /**
     * The edges for each of the character's friends.
     */
    val edges: List<Edge?>?,
    /**
     * Information for paginating this connection
     */
    val pageInfo: PageInfo,
    /**
     * For test java beans semantic naming only
     */
    val isEmpty: Boolean
  ) {
    fun marshaller(): ResponseFieldMarshaller = ResponseFieldMarshaller {
      it.writeString(RESPONSE_FIELDS[0], __typename)
      it.writeInt(RESPONSE_FIELDS[1], totalCount)
      it.writeList(RESPONSE_FIELDS[2], edges) { value, listItemWriter ->
        value?.forEach { value ->
          listItemWriter.writeObject(value?.marshaller())
        }
      }
      it.writeObject(RESPONSE_FIELDS[3], pageInfo.marshaller())
      it.writeBoolean(RESPONSE_FIELDS[4], isEmpty)
    }

    companion object {
      private val RESPONSE_FIELDS: Array<ResponseField> = arrayOf(
          ResponseField.forString("__typename", "__typename", null, false, null),
          ResponseField.forInt("totalCount", "totalCount", null, true, null),
          ResponseField.forList("edges", "edges", null, true, null),
          ResponseField.forObject("pageInfo", "pageInfo", null, false, null),
          ResponseField.forBoolean("isEmpty", "isEmpty", null, false, null)
          )

      operator fun invoke(reader: ResponseReader): FriendsConnection {
        val __typename = reader.readString(RESPONSE_FIELDS[0])
        val totalCount = reader.readInt(RESPONSE_FIELDS[1])
        val edges = reader.readList<Edge>(RESPONSE_FIELDS[2]) {
          it.readObject<Edge> { reader ->
            Edge(reader)
          }

        }
        val pageInfo = reader.readObject<PageInfo>(RESPONSE_FIELDS[3]) { reader ->
          PageInfo(reader)
        }

        val isEmpty = reader.readBoolean(RESPONSE_FIELDS[4])
        return FriendsConnection(
          __typename = __typename,
          totalCount = totalCount,
          edges = edges,
          pageInfo = pageInfo,
          isEmpty = isEmpty
        )
      }
    }
  }

  interface HeroDetailCharacter {
    fun marshaller(): ResponseFieldMarshaller
  }

  data class Node1(
    val __typename: String = "Character",
    /**
     * The name of the character
     */
    val name: String
  ) {
    fun marshaller(): ResponseFieldMarshaller = ResponseFieldMarshaller {
      it.writeString(RESPONSE_FIELDS[0], __typename)
      it.writeString(RESPONSE_FIELDS[1], name)
    }

    companion object {
      private val RESPONSE_FIELDS: Array<ResponseField> = arrayOf(
          ResponseField.forString("__typename", "__typename", null, false, null),
          ResponseField.forString("name", "name", null, false, null)
          )

      operator fun invoke(reader: ResponseReader): Node1 {
        val __typename = reader.readString(RESPONSE_FIELDS[0])
        val name = reader.readString(RESPONSE_FIELDS[1])
        return Node1(
          __typename = __typename,
          name = name
        )
      }
    }
  }

  data class Edge1(
    val __typename: String = "FriendsEdge",
    /**
     * The character represented by this friendship edge
     */
    val node: Node1?
  ) {
    fun marshaller(): ResponseFieldMarshaller = ResponseFieldMarshaller {
      it.writeString(RESPONSE_FIELDS[0], __typename)
      it.writeObject(RESPONSE_FIELDS[1], node?.marshaller())
    }

    companion object {
      private val RESPONSE_FIELDS: Array<ResponseField> = arrayOf(
          ResponseField.forString("__typename", "__typename", null, false, null),
          ResponseField.forObject("node", "node", null, true, null)
          )

      operator fun invoke(reader: ResponseReader): Edge1 {
        val __typename = reader.readString(RESPONSE_FIELDS[0])
        val node = reader.readObject<Node1>(RESPONSE_FIELDS[1]) { reader ->
          Node1(reader)
        }

        return Edge1(
          __typename = __typename,
          node = node
        )
      }
    }
  }

  data class PageInfo1(
    val __typename: String = "PageInfo",
    val hasNextPage: Boolean
  ) {
    fun marshaller(): ResponseFieldMarshaller = ResponseFieldMarshaller {
      it.writeString(RESPONSE_FIELDS[0], __typename)
      it.writeBoolean(RESPONSE_FIELDS[1], hasNextPage)
    }

    companion object {
      private val RESPONSE_FIELDS: Array<ResponseField> = arrayOf(
          ResponseField.forString("__typename", "__typename", null, false, null),
          ResponseField.forBoolean("hasNextPage", "hasNextPage", null, false, null)
          )

      operator fun invoke(reader: ResponseReader): PageInfo1 {
        val __typename = reader.readString(RESPONSE_FIELDS[0])
        val hasNextPage = reader.readBoolean(RESPONSE_FIELDS[1])
        return PageInfo1(
          __typename = __typename,
          hasNextPage = hasNextPage
        )
      }
    }
  }

  data class FriendsConnection1(
    val __typename: String = "FriendsConnection",
    /**
     * The total number of friends
     */
    val totalCount: Int?,
    /**
     * The edges for each of the character's friends.
     */
    val edges: List<Edge1?>?,
    /**
     * Information for paginating this connection
     */
    val pageInfo: PageInfo1,
    /**
     * For test java beans semantic naming only
     */
    val isEmpty: Boolean
  ) {
    fun marshaller(): ResponseFieldMarshaller = ResponseFieldMarshaller {
      it.writeString(RESPONSE_FIELDS[0], __typename)
      it.writeInt(RESPONSE_FIELDS[1], totalCount)
      it.writeList(RESPONSE_FIELDS[2], edges) { value, listItemWriter ->
        value?.forEach { value ->
          listItemWriter.writeObject(value?.marshaller())
        }
      }
      it.writeObject(RESPONSE_FIELDS[3], pageInfo.marshaller())
      it.writeBoolean(RESPONSE_FIELDS[4], isEmpty)
    }

    companion object {
      private val RESPONSE_FIELDS: Array<ResponseField> = arrayOf(
          ResponseField.forString("__typename", "__typename", null, false, null),
          ResponseField.forInt("totalCount", "totalCount", null, true, null),
          ResponseField.forList("edges", "edges", null, true, null),
          ResponseField.forObject("pageInfo", "pageInfo", null, false, null),
          ResponseField.forBoolean("isEmpty", "isEmpty", null, false, null)
          )

      operator fun invoke(reader: ResponseReader): FriendsConnection1 {
        val __typename = reader.readString(RESPONSE_FIELDS[0])
        val totalCount = reader.readInt(RESPONSE_FIELDS[1])
        val edges = reader.readList<Edge1>(RESPONSE_FIELDS[2]) {
          it.readObject<Edge1> { reader ->
            Edge1(reader)
          }

        }
        val pageInfo = reader.readObject<PageInfo1>(RESPONSE_FIELDS[3]) { reader ->
          PageInfo1(reader)
        }

        val isEmpty = reader.readBoolean(RESPONSE_FIELDS[4])
        return FriendsConnection1(
          __typename = __typename,
          totalCount = totalCount,
          edges = edges,
          pageInfo = pageInfo,
          isEmpty = isEmpty
        )
      }
    }
  }

  data class AsDroid(
    val __typename: String = "Droid",
    /**
     * What others call this droid
     */
    val name: String,
    /**
     * The friends of the droid exposed as a connection with edges
     */
    val friendsConnection: FriendsConnection1,
    /**
     * This droid's primary function
     */
    val primaryFunction: String?
  ) : HeroDetailCharacter {
    override fun marshaller(): ResponseFieldMarshaller = ResponseFieldMarshaller {
      it.writeString(RESPONSE_FIELDS[0], __typename)
      it.writeString(RESPONSE_FIELDS[1], name)
      it.writeObject(RESPONSE_FIELDS[2], friendsConnection.marshaller())
      it.writeString(RESPONSE_FIELDS[3], primaryFunction)
    }

    companion object {
      private val RESPONSE_FIELDS: Array<ResponseField> = arrayOf(
          ResponseField.forString("__typename", "__typename", null, false, null),
          ResponseField.forString("name", "name", null, false, null),
          ResponseField.forObject("friendsConnection", "friendsConnection", null, false, null),
          ResponseField.forString("primaryFunction", "primaryFunction", null, true, null)
          )

      operator fun invoke(reader: ResponseReader): AsDroid {
        val __typename = reader.readString(RESPONSE_FIELDS[0])
        val name = reader.readString(RESPONSE_FIELDS[1])
        val friendsConnection = reader.readObject<FriendsConnection1>(RESPONSE_FIELDS[2]) {
            reader ->
          FriendsConnection1(reader)
        }

        val primaryFunction = reader.readString(RESPONSE_FIELDS[3])
        return AsDroid(
          __typename = __typename,
          name = name,
          friendsConnection = friendsConnection,
          primaryFunction = primaryFunction
        )
      }
    }
  }
}
